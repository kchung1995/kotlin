/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.library.abi;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.library.abi.GenerateLibraryAbiReaderTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/klib/dump-abi/content")
@TestDataPath("$PROJECT_ROOT")
public class ClassicJsLibraryAbiReaderTestGenerated extends AbstractClassicJsLibraryAbiReaderTest {
  @Test
  public void testAllFilesPresentInContent() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/klib/dump-abi/content"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JS_IR, true);
  }

  @Test
  @TestMetadata("callables.kt")
  public void testCallables() {
    runTest("compiler/testData/klib/dump-abi/content/callables.kt");
  }

  @Test
  @TestMetadata("classifiers.kt")
  public void testClassifiers() {
    runTest("compiler/testData/klib/dump-abi/content/classifiers.kt");
  }

  @Test
  @TestMetadata("excluded_classes_1.kt")
  public void testExcluded_classes_1() {
    runTest("compiler/testData/klib/dump-abi/content/excluded_classes_1.kt");
  }

  @Test
  @TestMetadata("excluded_classes_2.kt")
  public void testExcluded_classes_2() {
    runTest("compiler/testData/klib/dump-abi/content/excluded_classes_2.kt");
  }

  @Test
  @TestMetadata("excluded_classes_3.kt")
  public void testExcluded_classes_3() {
    runTest("compiler/testData/klib/dump-abi/content/excluded_classes_3.kt");
  }

  @Test
  @TestMetadata("excluded_packages_non_root_1.kt")
  public void testExcluded_packages_non_root_1() {
    runTest("compiler/testData/klib/dump-abi/content/excluded_packages_non_root_1.kt");
  }

  @Test
  @TestMetadata("excluded_packages_non_root_2.kt")
  public void testExcluded_packages_non_root_2() {
    runTest("compiler/testData/klib/dump-abi/content/excluded_packages_non_root_2.kt");
  }

  @Test
  @TestMetadata("excluded_packages_non_root_3.kt")
  public void testExcluded_packages_non_root_3() {
    runTest("compiler/testData/klib/dump-abi/content/excluded_packages_non_root_3.kt");
  }

  @Test
  @TestMetadata("excluded_packages_non_root_4.kt")
  public void testExcluded_packages_non_root_4() {
    runTest("compiler/testData/klib/dump-abi/content/excluded_packages_non_root_4.kt");
  }

  @Test
  @TestMetadata("excluded_packages_root_1.kt")
  public void testExcluded_packages_root_1() {
    runTest("compiler/testData/klib/dump-abi/content/excluded_packages_root_1.kt");
  }

  @Test
  @TestMetadata("excluded_packages_root_2.kt")
  public void testExcluded_packages_root_2() {
    runTest("compiler/testData/klib/dump-abi/content/excluded_packages_root_2.kt");
  }

  @Test
  @TestMetadata("inheritance.kt")
  public void testInheritance() {
    runTest("compiler/testData/klib/dump-abi/content/inheritance.kt");
  }

  @Test
  @TestMetadata("kt64082-kt64085.kt")
  public void testKt64082_kt64085() {
    runTest("compiler/testData/klib/dump-abi/content/kt64082-kt64085.kt");
  }

  @Test
  @TestMetadata("root_package.kt")
  public void testRoot_package() {
    runTest("compiler/testData/klib/dump-abi/content/root_package.kt");
  }

  @Test
  @TestMetadata("specific_types_dnn.kt")
  public void testSpecific_types_dnn() {
    runTest("compiler/testData/klib/dump-abi/content/specific_types_dnn.kt");
  }

  @Test
  @TestMetadata("specific_types_dynamic.kt")
  public void testSpecific_types_dynamic() {
    runTest("compiler/testData/klib/dump-abi/content/specific_types_dynamic.kt");
  }

  @Test
  @TestMetadata("type_parameters.kt")
  public void testType_parameters() {
    runTest("compiler/testData/klib/dump-abi/content/type_parameters.kt");
  }

  @Test
  @TestMetadata("value_parameters.kt")
  public void testValue_parameters() {
    runTest("compiler/testData/klib/dump-abi/content/value_parameters.kt");
  }

  @Test
  @TestMetadata("visibilities.kt")
  public void testVisibilities() {
    runTest("compiler/testData/klib/dump-abi/content/visibilities.kt");
  }

  @Test
  @TestMetadata("with_non_public_markers_1.kt")
  public void testWith_non_public_markers_1() {
    runTest("compiler/testData/klib/dump-abi/content/with_non_public_markers_1.kt");
  }

  @Test
  @TestMetadata("with_non_public_markers_2.kt")
  public void testWith_non_public_markers_2() {
    runTest("compiler/testData/klib/dump-abi/content/with_non_public_markers_2.kt");
  }

  @Test
  @TestMetadata("with_non_public_markers_3.kt")
  public void testWith_non_public_markers_3() {
    runTest("compiler/testData/klib/dump-abi/content/with_non_public_markers_3.kt");
  }

  @Test
  @TestMetadata("with_non_public_markers_4.kt")
  public void testWith_non_public_markers_4() {
    runTest("compiler/testData/klib/dump-abi/content/with_non_public_markers_4.kt");
  }

  @Test
  @TestMetadata("with_non_public_markers_5.kt")
  public void testWith_non_public_markers_5() {
    runTest("compiler/testData/klib/dump-abi/content/with_non_public_markers_5.kt");
  }

  @Test
  @TestMetadata("with_non_public_markers_private_annotations.kt")
  public void testWith_non_public_markers_private_annotations() {
    runTest("compiler/testData/klib/dump-abi/content/with_non_public_markers_private_annotations.kt");
  }
}
