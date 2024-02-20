/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.standalone.fir.test.cases.generated.cases.components.psiDeclarationProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.standalone.fir.test.configurators.AnalysisApiFirStandaloneModeTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.standalone.fir.test.cases.components.psiDeclarationProvider.AbstractPsiDeclarationProviderTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/standalone/binary")
@TestDataPath("$PROJECT_ROOT")
public class FirStandaloneNormalAnalysisLibraryBinaryModulePsiDeclarationProviderTestGenerated extends AbstractPsiDeclarationProviderTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirStandaloneModeTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.LibraryBinary,
        AnalysisSessionMode.Normal,
        AnalysisApiMode.Standalone
      )
    );
  }

  @Test
  public void testAllFilesPresentInBinary() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/standalone/binary"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("multifileFacade.kt")
  public void testMultifileFacade() {
    runTest("analysis/analysis-api/testData/standalone/binary/multifileFacade.kt");
  }

  @Test
  @TestMetadata("propertiesInCompanionObject.kt")
  public void testPropertiesInCompanionObject() {
    runTest("analysis/analysis-api/testData/standalone/binary/propertiesInCompanionObject.kt");
  }

  @Test
  @TestMetadata("propertiesInCompanionObject_JvmField.kt")
  public void testPropertiesInCompanionObject_JvmField() {
    runTest("analysis/analysis-api/testData/standalone/binary/propertiesInCompanionObject_JvmField.kt");
  }

  @Test
  @TestMetadata("propertiesInCompanionObject_JvmStatic.kt")
  public void testPropertiesInCompanionObject_JvmStatic() {
    runTest("analysis/analysis-api/testData/standalone/binary/propertiesInCompanionObject_JvmStatic.kt");
  }

  @Test
  @TestMetadata("propertiesInInnerClass.kt")
  public void testPropertiesInInnerClass() {
    runTest("analysis/analysis-api/testData/standalone/binary/propertiesInInnerClass.kt");
  }

  @Test
  @TestMetadata("propertiesInNamedCompanionObject.kt")
  public void testPropertiesInNamedCompanionObject() {
    runTest("analysis/analysis-api/testData/standalone/binary/propertiesInNamedCompanionObject.kt");
  }

  @Test
  @TestMetadata("propertiesInNamedCompanionObject_JvmField.kt")
  public void testPropertiesInNamedCompanionObject_JvmField() {
    runTest("analysis/analysis-api/testData/standalone/binary/propertiesInNamedCompanionObject_JvmField.kt");
  }

  @Test
  @TestMetadata("propertiesInNamedCompanionObject_JvmStatic.kt")
  public void testPropertiesInNamedCompanionObject_JvmStatic() {
    runTest("analysis/analysis-api/testData/standalone/binary/propertiesInNamedCompanionObject_JvmStatic.kt");
  }

  @Test
  @TestMetadata("propertiesInNestedObject.kt")
  public void testPropertiesInNestedObject() {
    runTest("analysis/analysis-api/testData/standalone/binary/propertiesInNestedObject.kt");
  }

  @Test
  @TestMetadata("propertiesInObject.kt")
  public void testPropertiesInObject() {
    runTest("analysis/analysis-api/testData/standalone/binary/propertiesInObject.kt");
  }

  @Test
  @TestMetadata("propertiesInOuterClass.kt")
  public void testPropertiesInOuterClass() {
    runTest("analysis/analysis-api/testData/standalone/binary/propertiesInOuterClass.kt");
  }

  @Test
  @TestMetadata("propertyWithValueClass.kt")
  public void testPropertyWithValueClass() {
    runTest("analysis/analysis-api/testData/standalone/binary/propertyWithValueClass.kt");
  }

  @Test
  @TestMetadata("topLevelFunctionWithValueClass.kt")
  public void testTopLevelFunctionWithValueClass() {
    runTest("analysis/analysis-api/testData/standalone/binary/topLevelFunctionWithValueClass.kt");
  }
}
