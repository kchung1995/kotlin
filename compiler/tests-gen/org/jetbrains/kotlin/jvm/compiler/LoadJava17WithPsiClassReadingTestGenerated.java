/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jvm.compiler;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/loadJava17")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class LoadJava17WithPsiClassReadingTestGenerated extends AbstractLoadJava17WithPsiClassReadingTest {
  private void runTest(String testDataFilePath) {
    KotlinTestUtils.runTest(this::doTestCompiledJava, this, testDataFilePath);
  }

  public void testAllFilesPresentInLoadJava17() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava17"), Pattern.compile("^(.+)\\.java$"), null, true);
  }

  @TestMetadata("GenericRecord.java")
  public void testGenericRecord() {
    runTest("compiler/testData/loadJava17/GenericRecord.java");
  }

  @TestMetadata("SimpleRecord.java")
  public void testSimpleRecord() {
    runTest("compiler/testData/loadJava17/SimpleRecord.java");
  }
}
