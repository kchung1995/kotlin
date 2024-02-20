/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.incremental;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateJsTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/incremental/invalidationWithPL")
@TestDataPath("$PROJECT_ROOT")
public class JsFirInvalidationPerModuleWithPLTestGenerated extends AbstractJsFirInvalidationPerModuleWithPLTest {
  @Test
  public void testAllFilesPresentInInvalidationWithPL() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/incremental/invalidationWithPL"), Pattern.compile("^([^_](.+))$"), null, TargetBackend.JS_IR, false);
  }

  @Test
  @TestMetadata("changeFunctionSignature")
  public void testChangeFunctionSignature() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/changeFunctionSignature/");
  }

  @Test
  @TestMetadata("interfaceBecomeClass")
  public void testInterfaceBecomeClass() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/interfaceBecomeClass/");
  }

  @Test
  @TestMetadata("removeFunction")
  public void testRemoveFunction() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/removeFunction/");
  }

  @Test
  @TestMetadata("removeFunctionFromBlock")
  public void testRemoveFunctionFromBlock() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/removeFunctionFromBlock/");
  }

  @Test
  @TestMetadata("removeFunctionFromChainCall")
  public void testRemoveFunctionFromChainCall() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/removeFunctionFromChainCall/");
  }

  @Test
  @TestMetadata("removeFunctionFromElvis")
  public void testRemoveFunctionFromElvis() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/removeFunctionFromElvis/");
  }

  @Test
  @TestMetadata("removeFunctionFromInline")
  public void testRemoveFunctionFromInline() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/removeFunctionFromInline/");
  }

  @Test
  @TestMetadata("removeInlineFunction")
  public void testRemoveInlineFunction() {
    runTest("js/js.translator/testData/incremental/invalidationWithPL/removeInlineFunction/");
  }
}
