// DO NOT EDIT MANUALLY!
// Generated by org/jetbrains/kotlin/generators/arguments/GenerateGradleOptions.kt
// To regenerate run 'generateGradleOptions' task
@file:Suppress("RemoveRedundantQualifierName", "Deprecation", "DuplicatedCode")

package org.jetbrains.kotlin.gradle.dsl

internal abstract class KotlinNativeCompilerOptionsDefault @javax.inject.Inject constructor(
    objectFactory: org.gradle.api.model.ObjectFactory
) : org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptionsDefault(objectFactory), org.jetbrains.kotlin.gradle.dsl.KotlinNativeCompilerOptions {

    override val moduleName: org.gradle.api.provider.Property<kotlin.String> =
        objectFactory.property(kotlin.String::class.java)
}
