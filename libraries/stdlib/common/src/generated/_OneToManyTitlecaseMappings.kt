/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package kotlin.text

//
// NOTE: THIS FILE IS AUTO-GENERATED by the GenerateUnicodeData.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

// 10 mappings totally
internal fun Char.titlecaseImpl(): String {
    val uppercase = uppercase()
    if (uppercase.length > 1) {
        return if (this == '\u0149') uppercase else uppercase[0] + uppercase.substring(1).lowercase()
    }
    return titlecaseChar().toString()
}
