/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/getOrBuildFirBinary")
@TestDataPath("$PROJECT_ROOT")
public class LibraryGetOrBuildFirTestGenerated extends AbstractLibraryGetOrBuildFirTest {
    @Test
    public void testAllFilesPresentInGetOrBuildFirBinary() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/getOrBuildFirBinary"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("enumEntry.kt")
    public void testEnumEntry() throws Exception {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/enumEntry.kt");
    }

    @Test
    @TestMetadata("functionWithDefinitelyNotNullParameter.kt")
    public void testFunctionWithDefinitelyNotNullParameter() throws Exception {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/functionWithDefinitelyNotNullParameter.kt");
    }

    @Test
    @TestMetadata("parameter.kt")
    public void testParameter() throws Exception {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/parameter.kt");
    }

    @Test
    @TestMetadata("secondaryConstructor.kt")
    public void testSecondaryConstructor() throws Exception {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/secondaryConstructor.kt");
    }

    @Test
    @TestMetadata("simpleClass.kt")
    public void testSimpleClass() throws Exception {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/simpleClass.kt");
    }

    @Test
    @TestMetadata("simpleConstructor.kt")
    public void testSimpleConstructor() throws Exception {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/simpleConstructor.kt");
    }

    @Test
    @TestMetadata("simpleFunction.kt")
    public void testSimpleFunction() throws Exception {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/simpleFunction.kt");
    }

    @Test
    @TestMetadata("simpleProperty.kt")
    public void testSimpleProperty() throws Exception {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/simpleProperty.kt");
    }

    @Test
    @TestMetadata("topLevelFunction.kt")
    public void testTopLevelFunction() throws Exception {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/topLevelFunction.kt");
    }

    @Test
    @TestMetadata("typeParameter.kt")
    public void testTypeParameter() throws Exception {
        runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/typeParameter.kt");
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi")
    @TestDataPath("$PROJECT_ROOT")
    public class PublishedApi {
        @Test
        public void testAllFilesPresentInPublishedApi() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("publishedApiClass.kt")
        public void testPublishedApiClass() throws Exception {
            runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi/publishedApiClass.kt");
        }

        @Test
        @TestMetadata("publishedApiConstructor.kt")
        public void testPublishedApiConstructor() throws Exception {
            runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi/publishedApiConstructor.kt");
        }

        @Test
        @TestMetadata("publishedApiFunction.kt")
        public void testPublishedApiFunction() throws Exception {
            runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi/publishedApiFunction.kt");
        }

        @Test
        @TestMetadata("publishedApiPrimaryConstructor.kt")
        public void testPublishedApiPrimaryConstructor() throws Exception {
            runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi/publishedApiPrimaryConstructor.kt");
        }

        @Test
        @TestMetadata("publishedApiProperty.kt")
        public void testPublishedApiProperty() throws Exception {
            runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi/publishedApiProperty.kt");
        }

        @Test
        @TestMetadata("publishedApiPropertyGetter.kt")
        public void testPublishedApiPropertyGetter() throws Exception {
            runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi/publishedApiPropertyGetter.kt");
        }

        @Test
        @TestMetadata("publishedApiPropertySetter.kt")
        public void testPublishedApiPropertySetter() throws Exception {
            runTest("analysis/low-level-api-fir/testData/getOrBuildFirBinary/publishedApi/publishedApiPropertySetter.kt");
        }
    }
}
