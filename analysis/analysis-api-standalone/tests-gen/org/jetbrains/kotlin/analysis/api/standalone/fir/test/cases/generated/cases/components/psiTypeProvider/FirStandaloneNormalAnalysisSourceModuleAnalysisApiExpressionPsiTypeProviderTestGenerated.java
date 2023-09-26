/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.standalone.fir.test.cases.generated.cases.components.psiTypeProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.standalone.fir.test.AnalysisApiFirStandaloneModeTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.psiTypeProvider.AbstractAnalysisApiExpressionPsiTypeProviderTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forExpression")
@TestDataPath("$PROJECT_ROOT")
public class FirStandaloneNormalAnalysisSourceModuleAnalysisApiExpressionPsiTypeProviderTestGenerated extends AbstractAnalysisApiExpressionPsiTypeProviderTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFirStandaloneModeTestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fir,
                TestModuleKind.Source,
                AnalysisSessionMode.Normal,
                AnalysisApiMode.Standalone
            )
        );
    }

    @Test
    public void testAllFilesPresentInForExpression() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forExpression"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("capturedBoundType.kt")
    public void testCapturedBoundType() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forExpression/capturedBoundType.kt");
    }

    @Test
    @TestMetadata("class_object_call.kt")
    public void testClass_object_call() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forExpression/class_object_call.kt");
    }

    @Test
    @TestMetadata("class_object_constructor.kt")
    public void testClass_object_constructor() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forExpression/class_object_constructor.kt");
    }

    @Test
    @TestMetadata("KTIJ25461.kt")
    public void testKTIJ25461() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forExpression/KTIJ25461.kt");
    }

    @Test
    @TestMetadata("localClassWithUnresolvedSuperType.kt")
    public void testLocalClassWithUnresolvedSuperType() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forExpression/localClassWithUnresolvedSuperType.kt");
    }

    @Test
    @TestMetadata("recursiveTypeParameter.kt")
    public void testRecursiveTypeParameter() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forExpression/recursiveTypeParameter.kt");
    }

    @Test
    @TestMetadata("typeParamFlexibleUpperBound.kt")
    public void testTypeParamFlexibleUpperBound() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/forExpression/typeParamFlexibleUpperBound.kt");
    }
}
