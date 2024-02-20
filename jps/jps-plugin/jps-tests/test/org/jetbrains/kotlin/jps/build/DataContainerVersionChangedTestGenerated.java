/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jps.build;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.jps.GenerateJpsPluginTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("jps/jps-plugin/testData/incremental/cacheVersionChanged")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class DataContainerVersionChangedTestGenerated extends AbstractDataContainerVersionChangedTest {
  private void runTest(String testDataFilePath) {
    KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
  }

  public void testAllFilesPresentInCacheVersionChanged() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/cacheVersionChanged"), Pattern.compile("^([^\\.]+)$"), null, true);
  }

  @TestMetadata("clearedHasKotlin")
  public void testClearedHasKotlin() {
    runTest("jps/jps-plugin/testData/incremental/cacheVersionChanged/clearedHasKotlin/");
  }

  @TestMetadata("exportedModule")
  public void testExportedModule() {
    runTest("jps/jps-plugin/testData/incremental/cacheVersionChanged/exportedModule/");
  }

  @TestMetadata("javaOnlyModulesAreNotAffected")
  public void testJavaOnlyModulesAreNotAffected() {
    runTest("jps/jps-plugin/testData/incremental/cacheVersionChanged/javaOnlyModulesAreNotAffected/");
  }

  @TestMetadata("module1Modified")
  public void testModule1Modified() {
    runTest("jps/jps-plugin/testData/incremental/cacheVersionChanged/module1Modified/");
  }

  @TestMetadata("module2Modified")
  public void testModule2Modified() {
    runTest("jps/jps-plugin/testData/incremental/cacheVersionChanged/module2Modified/");
  }

  @TestMetadata("moduleWithConstantModified")
  public void testModuleWithConstantModified() {
    runTest("jps/jps-plugin/testData/incremental/cacheVersionChanged/moduleWithConstantModified/");
  }

  @TestMetadata("moduleWithInlineModified")
  public void testModuleWithInlineModified() {
    runTest("jps/jps-plugin/testData/incremental/cacheVersionChanged/moduleWithInlineModified/");
  }

  @TestMetadata("touchedFile")
  public void testTouchedFile() {
    runTest("jps/jps-plugin/testData/incremental/cacheVersionChanged/touchedFile/");
  }

  @TestMetadata("touchedOnlyJavaFile")
  public void testTouchedOnlyJavaFile() {
    runTest("jps/jps-plugin/testData/incremental/cacheVersionChanged/touchedOnlyJavaFile/");
  }

  @TestMetadata("untouchedFiles")
  public void testUntouchedFiles() {
    runTest("jps/jps-plugin/testData/incremental/cacheVersionChanged/untouchedFiles/");
  }

  @TestMetadata("withError")
  public void testWithError() {
    runTest("jps/jps-plugin/testData/incremental/cacheVersionChanged/withError/");
  }

  @TestMetadata("jps/jps-plugin/testData/incremental/cacheVersionChanged/clearedHasKotlin")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class ClearedHasKotlin extends AbstractDataContainerVersionChangedTest {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInClearedHasKotlin() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/cacheVersionChanged/clearedHasKotlin"), Pattern.compile("^([^\\.]+)$"), null, true);
    }
  }

  @TestMetadata("jps/jps-plugin/testData/incremental/cacheVersionChanged/exportedModule")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class ExportedModule extends AbstractDataContainerVersionChangedTest {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInExportedModule() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/cacheVersionChanged/exportedModule"), Pattern.compile("^([^\\.]+)$"), null, true);
    }
  }

  @TestMetadata("jps/jps-plugin/testData/incremental/cacheVersionChanged/javaOnlyModulesAreNotAffected")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class JavaOnlyModulesAreNotAffected extends AbstractDataContainerVersionChangedTest {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInJavaOnlyModulesAreNotAffected() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/cacheVersionChanged/javaOnlyModulesAreNotAffected"), Pattern.compile("^([^\\.]+)$"), null, true);
    }
  }

  @TestMetadata("jps/jps-plugin/testData/incremental/cacheVersionChanged/module1Modified")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class Module1Modified extends AbstractDataContainerVersionChangedTest {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInModule1Modified() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/cacheVersionChanged/module1Modified"), Pattern.compile("^([^\\.]+)$"), null, true);
    }
  }

  @TestMetadata("jps/jps-plugin/testData/incremental/cacheVersionChanged/module2Modified")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class Module2Modified extends AbstractDataContainerVersionChangedTest {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInModule2Modified() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/cacheVersionChanged/module2Modified"), Pattern.compile("^([^\\.]+)$"), null, true);
    }
  }

  @TestMetadata("jps/jps-plugin/testData/incremental/cacheVersionChanged/moduleWithConstantModified")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class ModuleWithConstantModified extends AbstractDataContainerVersionChangedTest {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInModuleWithConstantModified() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/cacheVersionChanged/moduleWithConstantModified"), Pattern.compile("^([^\\.]+)$"), null, true);
    }
  }

  @TestMetadata("jps/jps-plugin/testData/incremental/cacheVersionChanged/moduleWithInlineModified")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class ModuleWithInlineModified extends AbstractDataContainerVersionChangedTest {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInModuleWithInlineModified() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/cacheVersionChanged/moduleWithInlineModified"), Pattern.compile("^([^\\.]+)$"), null, true);
    }
  }

  @TestMetadata("jps/jps-plugin/testData/incremental/cacheVersionChanged/touchedFile")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class TouchedFile extends AbstractDataContainerVersionChangedTest {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInTouchedFile() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/cacheVersionChanged/touchedFile"), Pattern.compile("^([^\\.]+)$"), null, true);
    }
  }

  @TestMetadata("jps/jps-plugin/testData/incremental/cacheVersionChanged/touchedOnlyJavaFile")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class TouchedOnlyJavaFile extends AbstractDataContainerVersionChangedTest {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInTouchedOnlyJavaFile() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/cacheVersionChanged/touchedOnlyJavaFile"), Pattern.compile("^([^\\.]+)$"), null, true);
    }
  }

  @TestMetadata("jps/jps-plugin/testData/incremental/cacheVersionChanged/untouchedFiles")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class UntouchedFiles extends AbstractDataContainerVersionChangedTest {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInUntouchedFiles() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/cacheVersionChanged/untouchedFiles"), Pattern.compile("^([^\\.]+)$"), null, true);
    }
  }

  @TestMetadata("jps/jps-plugin/testData/incremental/cacheVersionChanged/withError")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class WithError extends AbstractDataContainerVersionChangedTest {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInWithError() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps/jps-plugin/testData/incremental/cacheVersionChanged/withError"), Pattern.compile("^([^\\.]+)$"), null, true);
    }
  }
}
