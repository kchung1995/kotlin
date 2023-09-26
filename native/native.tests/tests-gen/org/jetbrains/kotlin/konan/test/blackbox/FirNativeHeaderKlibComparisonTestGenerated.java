/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.blackbox;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.junit.jupiter.api.Tag;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.FirPipeline;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("native/native.tests/testData/klib/header-klibs/comparison")
@TestDataPath("$PROJECT_ROOT")
@Tag("frontend-fir")
@FirPipeline()
public class FirNativeHeaderKlibComparisonTestGenerated extends AbstractNativeHeaderKlibComparisonTest {
    @Test
    public void testAllFilesPresentInComparison() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/klib/header-klibs/comparison"), Pattern.compile("^([^\\.]+)$"), null, false);
    }

    @Test
    @TestMetadata("anonymousObjects")
    public void testAnonymousObjects() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/anonymousObjects/");
    }

    @Test
    @TestMetadata("classFlags")
    public void testClassFlags() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/classFlags/");
    }

    @Test
    @TestMetadata("classPrivateMembers")
    public void testClassPrivateMembers() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/classPrivateMembers/");
    }

    @Test
    @TestMetadata("constant")
    public void testConstant() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/constant/");
    }

    @Test
    @TestMetadata("declarationOrderInline")
    public void testDeclarationOrderInline() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/declarationOrderInline/");
    }

    @Test
    @TestMetadata("functionBody")
    public void testFunctionBody() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/functionBody/");
    }

    @Test
    @TestMetadata("inlineFunInPrivateClass")
    public void testInlineFunInPrivateClass() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/inlineFunInPrivateClass/");
    }

    @Test
    @TestMetadata("inlineFunInPrivateNestedClass")
    public void testInlineFunInPrivateNestedClass() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/inlineFunInPrivateNestedClass/");
    }

    @Test
    @TestMetadata("inlineFunctionBody")
    public void testInlineFunctionBody() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/inlineFunctionBody/");
    }

    @Test
    @TestMetadata("lambdas")
    public void testLambdas() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/lambdas/");
    }

    @Test
    @TestMetadata("parameterName")
    public void testParameterName() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/parameterName/");
    }

    @Test
    @TestMetadata("privateInterface")
    public void testPrivateInterface() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/privateInterface/");
    }

    @Test
    @TestMetadata("privateTypealias")
    public void testPrivateTypealias() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/privateTypealias/");
    }

    @Test
    @TestMetadata("returnType")
    public void testReturnType() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/returnType/");
    }

    @Test
    @TestMetadata("superClass")
    public void testSuperClass() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/superClass/");
    }

    @Test
    @TestMetadata("syntheticAccessors")
    public void testSyntheticAccessors() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/syntheticAccessors/");
    }

    @Test
    @TestMetadata("topLevelPrivateMembers")
    public void testTopLevelPrivateMembers() throws Exception {
        runTest("native/native.tests/testData/klib/header-klibs/comparison/topLevelPrivateMembers/");
    }
}
