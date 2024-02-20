/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.expressionInfoProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.expressionInfoProvider.AbstractWhenMissingCasesTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisSourceModuleWhenMissingCasesTestGenerated extends AbstractWhenMissingCasesTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.Source,
        AnalysisSessionMode.Normal,
        AnalysisApiMode.Ide
      )
    );
  }

  @Test
  public void testAllFilesPresentInWhenMissingCases() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("boolean_else.kt")
  public void testBoolean_else() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/boolean_else.kt");
  }

  @Test
  @TestMetadata("boolean_empty.kt")
  public void testBoolean_empty() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/boolean_empty.kt");
  }

  @Test
  @TestMetadata("boolean_noSubject.kt")
  public void testBoolean_noSubject() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/boolean_noSubject.kt");
  }

  @Test
  @TestMetadata("boolean_noSubjectIncorrectCode.kt")
  public void testBoolean_noSubjectIncorrectCode() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/boolean_noSubjectIncorrectCode.kt");
  }

  @Test
  @TestMetadata("boolean_noSubject_else.kt")
  public void testBoolean_noSubject_else() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/boolean_noSubject_else.kt");
  }

  @Test
  @TestMetadata("boolean_partial.kt")
  public void testBoolean_partial() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/boolean_partial.kt");
  }

  @Test
  @TestMetadata("enum_else.kt")
  public void testEnum_else() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/enum_else.kt");
  }

  @Test
  @TestMetadata("enum_empty.kt")
  public void testEnum_empty() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/enum_empty.kt");
  }

  @Test
  @TestMetadata("enum_partial.kt")
  public void testEnum_partial() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/enum_partial.kt");
  }

  @Test
  @TestMetadata("nothing.kt")
  public void testNothing() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/nothing.kt");
  }

  @Test
  @TestMetadata("nullableBoolean.kt")
  public void testNullableBoolean() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/nullableBoolean.kt");
  }

  @Test
  @TestMetadata("nullableEnum.kt")
  public void testNullableEnum() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/nullableEnum.kt");
  }

  @Test
  @TestMetadata("nullableNothing.kt")
  public void testNullableNothing() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/nullableNothing.kt");
  }

  @Test
  @TestMetadata("nullableSealedClass_empty.kt")
  public void testNullableSealedClass_empty() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/nullableSealedClass_empty.kt");
  }

  @Test
  @TestMetadata("sealedClass_else.kt")
  public void testSealedClass_else() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/sealedClass_else.kt");
  }

  @Test
  @TestMetadata("sealedClass_empty.kt")
  public void testSealedClass_empty() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/sealedClass_empty.kt");
  }

  @Test
  @TestMetadata("sealedClass_partial.kt")
  public void testSealedClass_partial() {
    runTest("analysis/analysis-api/testData/components/expressionInfoProvider/whenMissingCases/sealedClass_partial.kt");
  }
}
