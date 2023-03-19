/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.lightTree.converter

import com.intellij.lang.LighterASTNode
import com.intellij.openapi.util.Ref
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.util.diff.FlyweightCapableTreeStructure
import org.jetbrains.kotlin.*
import org.jetbrains.kotlin.ElementTypeUtils.isExpression
import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.builder.BaseFirBuilder
import org.jetbrains.kotlin.fir.builder.Context
import org.jetbrains.kotlin.fir.builder.escapedStringToCharacter
import org.jetbrains.kotlin.fir.types.impl.FirImplicitTypeRefImplWithoutSource
import org.jetbrains.kotlin.lexer.KtToken
import org.jetbrains.kotlin.lexer.KtTokens.*
import org.jetbrains.kotlin.name.Name
import kotlin.contracts.ExperimentalContracts

abstract class BaseConverter(
    baseSession: FirSession,
    val tree: FlyweightCapableTreeStructure<LighterASTNode>,
    context: Context<LighterASTNode> = Context()
) : BaseFirBuilder<LighterASTNode>(baseSession, context) {
    abstract val offset: Int

    protected val implicitType = FirImplicitTypeRefImplWithoutSource

    protected open fun reportSyntaxError(node: LighterASTNode) {}

    override fun LighterASTNode.toFirSourceElement(kind: KtFakeSourceElementKind?): KtLightSourceElement {
        val startOffset = offset + tree.getStartOffset(this)
        val endOffset = offset + tree.getEndOffset(this)
        return toKtLightSourceElement(tree, kind ?: context.forcedElementSourceKind ?: KtRealSourceElementKind, startOffset, endOffset)
    }

    override val LighterASTNode.elementType: IElementType
        get() = this.tokenType

    override val LighterASTNode.asText: String
        get() = this.toString()

    override val LighterASTNode.unescapedValue: String
        get() {
            val escape = this.asText
            return escapedStringToCharacter(escape).value?.toString()
                ?: escape.replace("\\", "").replace("u", "\\u")
        }

    override fun LighterASTNode.getReferencedNameAsName(): Name {
        return this.asText.nameAsSafeName()
    }

    override fun LighterASTNode.getLabelName(): String? {
        if (tokenType == KtNodeTypes.FUN) {
            return getParent()?.getLabelName()
        }
        this.forEachChildren {
            when (it.tokenType) {
                KtNodeTypes.LABEL_QUALIFIER -> return it.asText.replaceFirst("@", "")
            }
        }

        return null
    }

    override fun LighterASTNode.getExpressionInParentheses() = getFirstChildExpression()

    override fun LighterASTNode.getAnnotatedExpression() = getFirstChildExpression()

    override fun LighterASTNode.getLabeledExpression() = getLastChildExpression()

    private fun LighterASTNode.getFirstChildExpression(): LighterASTNode? {
        forEachChildren {
            if (it.isExpression()) return it
        }

        return null
    }

    protected fun LighterASTNode.getFirstChildExpressionUnwrapped(): LighterASTNode? {
        val expression = getFirstChildExpression() ?: return null
        return if (expression.tokenType == KtNodeTypes.PARENTHESIZED) {
            expression.getFirstChildExpressionUnwrapped()
        } else {
            expression
        }
    }

    private fun LighterASTNode.getLastChildExpression(): LighterASTNode? {
        var result: LighterASTNode? = null
        forEachChildren {
            if (it.isExpression()) {
                result = it
            }
        }

        return result
    }

    override fun LighterASTNode.getChildNodeByType(type: IElementType): LighterASTNode? {
        return this.getChildNodesByType(type).firstOrNull()
    }

    override val LighterASTNode?.receiverExpression: LighterASTNode?
        get() {
            var candidate: LighterASTNode? = null
            this?.forEachChildren {
                when (it.tokenType) {
                    DOT, SAFE_ACCESS -> return if (candidate?.elementType != TokenType.ERROR_ELEMENT) candidate else null
                    else -> candidate = it
                }
            }
            return null
        }

    override val LighterASTNode?.selectorExpression: LighterASTNode?
        get() {
            var isSelector = false
            this?.forEachChildren {
                when (it.tokenType) {
                    DOT, SAFE_ACCESS -> isSelector = true
                    else -> if (isSelector) return if (it.elementType != TokenType.ERROR_ELEMENT) it else null
                }
            }
            return null
        }

    override val LighterASTNode?.arrayExpression: LighterASTNode?
        get() = this?.getFirstChildExpression()

    override val LighterASTNode?.indexExpressions: List<LighterASTNode>?
        get() = this?.getLastChildExpression()?.getChildrenAsArray()?.filterNotNull()?.filter { it.isExpression() }

    fun LighterASTNode.getParent(): LighterASTNode? {
        return tree.getParent(this)
    }

    fun LighterASTNode.getParents(): Sequence<LighterASTNode> {
        var node = this
        return sequence {
            while (true) {
                yield(node)
                node = node.getParent() ?: break
            }
        }
    }

    fun LighterASTNode?.getChildNodesByType(type: IElementType): List<LighterASTNode> {
        return this?.forEachChildrenReturnList { node, container ->
            when (node.tokenType) {
                type -> container += node
            }
        } ?: emptyList()
    }

    fun LighterASTNode?.getChildrenAsArray(): Array<out LighterASTNode?> {
        if (this == null) return arrayOf()

        val kidsRef = Ref<Array<LighterASTNode?>>()
        tree.getChildren(this, kidsRef)
        return kidsRef.get()
    }

    fun LighterASTNode?.getFirstChild(): LighterASTNode? {
        return getChildrenAsArray().firstOrNull()
    }

    @OptIn(ExperimentalContracts::class)
    protected inline fun LighterASTNode.forEachChildren(vararg skipTokens: KtToken, f: (LighterASTNode) -> Unit) {
        val kidsArray = this.getChildrenAsArray()
        for (kid in kidsArray) {
            if (kid == null) break
            val tokenType = kid.tokenType
            if (COMMENTS.contains(tokenType) || tokenType == WHITE_SPACE || tokenType == SEMICOLON || tokenType in skipTokens) continue
            if (tokenType == TokenType.ERROR_ELEMENT) {
                reportSyntaxError(kid)
                continue
            }
            f(kid)
        }
    }

    protected inline fun <T> LighterASTNode.forEachChildrenReturnList(f: (LighterASTNode, MutableList<T>) -> Unit): List<T> {
        val kidsArray = this.getChildrenAsArray()

        val container = mutableListOf<T>()
        for (kid in kidsArray) {
            if (kid == null) break
            val tokenType = kid.tokenType
            if (COMMENTS.contains(tokenType) || tokenType == WHITE_SPACE || tokenType == SEMICOLON) continue
            if (tokenType == TokenType.ERROR_ELEMENT) {
                reportSyntaxError(kid)
                continue
            }
            f(kid, container)
        }

        return container
    }
}
