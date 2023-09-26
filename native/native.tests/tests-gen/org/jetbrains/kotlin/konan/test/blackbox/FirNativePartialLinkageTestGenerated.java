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
@TestMetadata("compiler/testData/klib/partial-linkage")
@TestDataPath("$PROJECT_ROOT")
@Tag("frontend-fir")
@FirPipeline()
public class FirNativePartialLinkageTestGenerated extends AbstractNativePartialLinkageTest {
    @Test
    @TestMetadata("addEnumEntry")
    public void testAddEnumEntry() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/addEnumEntry/");
    }

    @Test
    @TestMetadata("addSealedSubclass")
    public void testAddSealedSubclass() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/addSealedSubclass/");
    }

    @Test
    public void testAllFilesPresentInPartial_linkage() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/klib/partial-linkage"), Pattern.compile("^([^_](.+))$"), null, false);
    }

    @Test
    @TestMetadata("changeClassVisibility")
    public void testChangeClassVisibility() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/changeClassVisibility/");
    }

    @Test
    @TestMetadata("changeFunctionVisibility")
    public void testChangeFunctionVisibility() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/changeFunctionVisibility/");
    }

    @Test
    @TestMetadata("changePropertyVisibility")
    public void testChangePropertyVisibility() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/changePropertyVisibility/");
    }

    @Test
    @TestMetadata("classTransformations")
    public void testClassTransformations() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/classTransformations/");
    }

    @Test
    @TestMetadata("externalDeclarations")
    public void testExternalDeclarations() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/externalDeclarations/");
    }

    @Test
    @TestMetadata("functionTransformations")
    public void testFunctionTransformations() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/functionTransformations/");
    }

    @Test
    @TestMetadata("inheritanceIssues")
    public void testInheritanceIssues() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/inheritanceIssues/");
    }

    @Test
    @TestMetadata("noNonImplementedCallableFalsePositives")
    public void testNoNonImplementedCallableFalsePositives() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/noNonImplementedCallableFalsePositives/");
    }

    @Test
    @TestMetadata("nonAbstractCallableBecomesAbstract")
    public void testNonAbstractCallableBecomesAbstract() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/nonAbstractCallableBecomesAbstract/");
    }

    @Test
    @TestMetadata("nonExhaustivenessOfWhenClause")
    public void testNonExhaustivenessOfWhenClause() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/nonExhaustivenessOfWhenClause/");
    }

    @Test
    @TestMetadata("propertyTransformations")
    public void testPropertyTransformations() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/propertyTransformations/");
    }

    @Test
    @TestMetadata("referencingUnusableDeclarations")
    public void testReferencingUnusableDeclarations() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/referencingUnusableDeclarations/");
    }

    @Test
    @TestMetadata("removeAbstractCallableFromAbstractClassOrInterface")
    public void testRemoveAbstractCallableFromAbstractClassOrInterface() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/removeAbstractCallableFromAbstractClassOrInterface/");
    }

    @Test
    @TestMetadata("removeCallable")
    public void testRemoveCallable() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/removeCallable/");
    }

    @Test
    @TestMetadata("removeClass")
    public void testRemoveClass() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/removeClass/");
    }

    @Test
    @TestMetadata("removeEnumEntry")
    public void testRemoveEnumEntry() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/removeEnumEntry/");
    }

    @Test
    @TestMetadata("removeSealedSubclass")
    public void testRemoveSealedSubclass() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/removeSealedSubclass/");
    }

    @Test
    @TestMetadata("replaceCallableReturnType")
    public void testReplaceCallableReturnType() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/replaceCallableReturnType/");
    }

    @Test
    @TestMetadata("severalInheritedImplementations")
    public void testSeveralInheritedImplementations() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/severalInheritedImplementations/");
    }

    @Test
    @TestMetadata("typeAliasChanges")
    public void testTypeAliasChanges() throws Exception {
        runTest("compiler/testData/klib/partial-linkage/typeAliasChanges/");
    }
}
