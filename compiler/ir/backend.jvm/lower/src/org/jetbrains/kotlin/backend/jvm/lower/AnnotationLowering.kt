/*
 * Copyright 2010-2018 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.backend.jvm.lower

import org.jetbrains.kotlin.backend.common.ClassLoweringPass
import org.jetbrains.kotlin.backend.common.phaser.makeIrFilePhase
import org.jetbrains.kotlin.backend.jvm.JvmBackendContext
import org.jetbrains.kotlin.ir.declarations.IrClass
import org.jetbrains.kotlin.ir.declarations.IrConstructor
import org.jetbrains.kotlin.ir.util.isAnnotationClass

internal val annotationPhase = makeIrFilePhase<JvmBackendContext>(
    { AnnotationLowering() },
    name = "Annotation",
    description = "Remove constructors of annotation classes"
)

private class AnnotationLowering : ClassLoweringPass {
    override fun lower(irClass: IrClass) {
        if (irClass.isAnnotationClass) {
            irClass.declarations.removeIf { it is IrConstructor }
        }
    }
}
