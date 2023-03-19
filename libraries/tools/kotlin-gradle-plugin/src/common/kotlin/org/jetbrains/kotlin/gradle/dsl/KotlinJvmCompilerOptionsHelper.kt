// DO NOT EDIT MANUALLY!
// Generated by org/jetbrains/kotlin/generators/arguments/GenerateGradleOptions.kt
// To regenerate run 'generateGradleOptions' task
@file:Suppress("RemoveRedundantQualifierName", "Deprecation", "DuplicatedCode")

package org.jetbrains.kotlin.gradle.dsl

internal object KotlinJvmCompilerOptionsHelper {

    internal fun fillCompilerArguments(
        from: org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompilerOptions,
        args: org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments,
    ) {
        org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptionsHelper.fillCompilerArguments(from, args)
        args.javaParameters = from.javaParameters.get()
        args.jvmTarget = from.jvmTarget.orNull?.target
        args.moduleName = from.moduleName.orNull
        args.noJdk = from.noJdk.get()

        // Arguments with always default values when used from build tools
        args.noStdlib = true
        args.noReflect = true
    }

    internal fun fillDefaultValues(
        args: org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments,
    ) {
        org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptionsHelper.fillDefaultValues(args)
        args.javaParameters = false
        args.jvmTarget = null
        args.moduleName = null
        args.noJdk = false

        // Arguments with always default values when used from build tools
        args.noStdlib = true
        args.noReflect = true
    }

    internal fun syncOptionsAsConvention(
        from: org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompilerOptions,
        into: org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompilerOptions,
    ) {
        org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptionsHelper.syncOptionsAsConvention(from, into)
        into.javaParameters.convention(from.javaParameters)
        into.jvmTarget.convention(from.jvmTarget)
        into.moduleName.convention(from.moduleName)
        into.noJdk.convention(from.noJdk)
    }
}
