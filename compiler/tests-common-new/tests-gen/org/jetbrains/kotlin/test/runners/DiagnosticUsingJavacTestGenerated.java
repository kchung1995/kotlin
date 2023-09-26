/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.test.runners;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/tests/javac")
@TestDataPath("$PROJECT_ROOT")
public class DiagnosticUsingJavacTestGenerated extends AbstractDiagnosticUsingJavacTest {
    @Test
    public void testAllFilesPresentInJavac() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/tests/javac"), Pattern.compile("^(.*)\\.kts?$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
    }

    @Test
    @TestMetadata("Annotations.kt")
    public void testAnnotations() throws Exception {
        runTest("compiler/testData/diagnostics/tests/javac/Annotations.kt");
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/tests/javac/fieldsResolution")
    @TestDataPath("$PROJECT_ROOT")
    public class FieldsResolution {
        @Test
        public void testAllFilesPresentInFieldsResolution() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/tests/javac/fieldsResolution"), Pattern.compile("^(.*)\\.kts?$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
        }

        @Test
        @TestMetadata("AsteriskStaticImportsAmbiguity.kt")
        public void testAsteriskStaticImportsAmbiguity() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/fieldsResolution/AsteriskStaticImportsAmbiguity.kt");
        }

        @Test
        @TestMetadata("BinaryInitializers.kt")
        public void testBinaryInitializers() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/fieldsResolution/BinaryInitializers.kt");
        }

        @Test
        @TestMetadata("ConstantByFqName.kt")
        public void testConstantByFqName() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/fieldsResolution/ConstantByFqName.kt");
        }

        @Test
        @TestMetadata("ConstantValues.kt")
        public void testConstantValues() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/fieldsResolution/ConstantValues.kt");
        }

        @Test
        @TestMetadata("ConstantValuesFromKtFile.kt")
        public void testConstantValuesFromKtFile() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/fieldsResolution/ConstantValuesFromKtFile.kt");
        }

        @Test
        @TestMetadata("FieldFromOuterClass.kt")
        public void testFieldFromOuterClass() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/fieldsResolution/FieldFromOuterClass.kt");
        }

        @Test
        @TestMetadata("InheritedField.kt")
        public void testInheritedField() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/fieldsResolution/InheritedField.kt");
        }

        @Test
        @TestMetadata("MultipleOuters.kt")
        public void testMultipleOuters() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/fieldsResolution/MultipleOuters.kt");
        }

        @Test
        @TestMetadata("ResolutionPriority.kt")
        public void testResolutionPriority() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/fieldsResolution/ResolutionPriority.kt");
        }

        @Test
        @TestMetadata("SameFieldInSupertypes.kt")
        public void testSameFieldInSupertypes() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/fieldsResolution/SameFieldInSupertypes.kt");
        }

        @Test
        @TestMetadata("StaticImport.kt")
        public void testStaticImport() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/fieldsResolution/StaticImport.kt");
        }

        @Test
        @TestMetadata("StaticImportsAmbiguity.kt")
        public void testStaticImportsAmbiguity() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/fieldsResolution/StaticImportsAmbiguity.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/tests/javac/imports")
    @TestDataPath("$PROJECT_ROOT")
    public class Imports {
        @Test
        public void testAllFilesPresentInImports() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/tests/javac/imports"), Pattern.compile("^(.*)\\.kts?$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
        }

        @Test
        @TestMetadata("AllUnderImportsAmbiguity.kt")
        public void testAllUnderImportsAmbiguity() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/AllUnderImportsAmbiguity.kt");
        }

        @Test
        @TestMetadata("AllUnderImportsLessPriority.kt")
        public void testAllUnderImportsLessPriority() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/AllUnderImportsLessPriority.kt");
        }

        @Test
        @TestMetadata("ClassImportsConflicting.kt")
        public void testClassImportsConflicting() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/ClassImportsConflicting.kt");
        }

        @Test
        @TestMetadata("CurrentPackageAndAllUnderImport.kt")
        public void testCurrentPackageAndAllUnderImport() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/CurrentPackageAndAllUnderImport.kt");
        }

        @Test
        @TestMetadata("CurrentPackageAndExplicitImport.kt")
        public void testCurrentPackageAndExplicitImport() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/CurrentPackageAndExplicitImport.kt");
        }

        @Test
        @TestMetadata("CurrentPackageAndExplicitNestedImport.kt")
        public void testCurrentPackageAndExplicitNestedImport() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/CurrentPackageAndExplicitNestedImport.kt");
        }

        @Test
        @TestMetadata("CurrentPackageAndNestedAsteriskImport.kt")
        public void testCurrentPackageAndNestedAsteriskImport() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/CurrentPackageAndNestedAsteriskImport.kt");
        }

        @Test
        @TestMetadata("ImportGenericVsPackage.kt")
        public void testImportGenericVsPackage() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/ImportGenericVsPackage.kt");
        }

        @Test
        @TestMetadata("ImportProtectedClass.kt")
        public void testImportProtectedClass() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/ImportProtectedClass.kt");
        }

        @Test
        @TestMetadata("ImportTwoTimes.kt")
        public void testImportTwoTimes() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/ImportTwoTimes.kt");
        }

        @Test
        @TestMetadata("ImportTwoTimesStar.kt")
        public void testImportTwoTimesStar() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/ImportTwoTimesStar.kt");
        }

        @Test
        @TestMetadata("NestedAndTopLevelClassClash.kt")
        public void testNestedAndTopLevelClassClash() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/NestedAndTopLevelClassClash.kt");
        }

        @Test
        @TestMetadata("NestedClassClash.kt")
        public void testNestedClassClash() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/NestedClassClash.kt");
        }

        @Test
        @TestMetadata("PackageExplicitAndStartImport.kt")
        public void testPackageExplicitAndStartImport() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/PackageExplicitAndStartImport.kt");
        }

        @Test
        @TestMetadata("PackagePrivateAndPublicNested.kt")
        public void testPackagePrivateAndPublicNested() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/PackagePrivateAndPublicNested.kt");
        }

        @Test
        @TestMetadata("TopLevelClassVsPackage.kt")
        public void testTopLevelClassVsPackage() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/TopLevelClassVsPackage.kt");
        }

        @Test
        @TestMetadata("TopLevelClassVsPackage2.kt")
        public void testTopLevelClassVsPackage2() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/imports/TopLevelClassVsPackage2.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/tests/javac/inheritance")
    @TestDataPath("$PROJECT_ROOT")
    public class Inheritance {
        @Test
        public void testAllFilesPresentInInheritance() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/tests/javac/inheritance"), Pattern.compile("^(.*)\\.kts?$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
        }

        @Test
        @TestMetadata("IheritanceOfInner.kt")
        public void testIheritanceOfInner() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/IheritanceOfInner.kt");
        }

        @Test
        @TestMetadata("InheritanceAmbiguity.kt")
        public void testInheritanceAmbiguity() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/InheritanceAmbiguity.kt");
        }

        @Test
        @TestMetadata("InheritanceAmbiguity2.kt")
        public void testInheritanceAmbiguity2() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/InheritanceAmbiguity2.kt");
        }

        @Test
        @TestMetadata("InheritanceAmbiguity3.kt")
        public void testInheritanceAmbiguity3() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/InheritanceAmbiguity3.kt");
        }

        @Test
        @TestMetadata("InheritanceAmbiguity4.kt")
        public void testInheritanceAmbiguity4() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/InheritanceAmbiguity4.kt");
        }

        @Test
        @TestMetadata("InheritanceWithKotlin.kt")
        public void testInheritanceWithKotlin() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/InheritanceWithKotlin.kt");
        }

        @Test
        @TestMetadata("InheritanceWithKotlinClasses.kt")
        public void testInheritanceWithKotlinClasses() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/InheritanceWithKotlinClasses.kt");
        }

        @Test
        @TestMetadata("InheritedInner.kt")
        public void testInheritedInner() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/InheritedInner.kt");
        }

        @Test
        @TestMetadata("InheritedInner2.kt")
        public void testInheritedInner2() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/InheritedInner2.kt");
        }

        @Test
        @TestMetadata("InheritedInnerAndSupertypeWithSameName.kt")
        public void testInheritedInnerAndSupertypeWithSameName() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/InheritedInnerAndSupertypeWithSameName.kt");
        }

        @Test
        @TestMetadata("InheritedInnerUsageInInner.kt")
        public void testInheritedInnerUsageInInner() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/InheritedInnerUsageInInner.kt");
        }

        @Test
        @TestMetadata("InheritedKotlinInner.kt")
        public void testInheritedKotlinInner() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/InheritedKotlinInner.kt");
        }

        @Test
        @TestMetadata("InnerAndInheritedInner.kt")
        public void testInnerAndInheritedInner() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/InnerAndInheritedInner.kt");
        }

        @Test
        @TestMetadata("ManyInheritedClasses.kt")
        public void testManyInheritedClasses() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/ManyInheritedClasses.kt");
        }

        @Test
        @TestMetadata("SameInnersInSupertypeAndSupertypesSupertype.kt")
        public void testSameInnersInSupertypeAndSupertypesSupertype() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/SameInnersInSupertypeAndSupertypesSupertype.kt");
        }

        @Test
        @TestMetadata("SuperTypeWithSameInner.kt")
        public void testSuperTypeWithSameInner() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/SuperTypeWithSameInner.kt");
        }

        @Test
        @TestMetadata("SupertypeInnerAndTypeParameterWithSameNames.kt")
        public void testSupertypeInnerAndTypeParameterWithSameNames() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inheritance/SupertypeInnerAndTypeParameterWithSameNames.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/tests/javac/inners")
    @TestDataPath("$PROJECT_ROOT")
    public class Inners {
        @Test
        public void testAllFilesPresentInInners() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/tests/javac/inners"), Pattern.compile("^(.*)\\.kts?$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
        }

        @Test
        @TestMetadata("ComplexCase.kt")
        public void testComplexCase() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inners/ComplexCase.kt");
        }

        @Test
        @TestMetadata("ComplexCase2.kt")
        public void testComplexCase2() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inners/ComplexCase2.kt");
        }

        @Test
        @TestMetadata("CurrentPackageAndInner.kt")
        public void testCurrentPackageAndInner() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inners/CurrentPackageAndInner.kt");
        }

        @Test
        @TestMetadata("ImportThriceNestedClass.kt")
        public void testImportThriceNestedClass() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inners/ImportThriceNestedClass.kt");
        }

        @Test
        @TestMetadata("InnerInInner.kt")
        public void testInnerInInner() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inners/InnerInInner.kt");
        }

        @Test
        @TestMetadata("Nested.kt")
        public void testNested() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inners/Nested.kt");
        }

        @Test
        @TestMetadata("ThriceNestedClass.kt")
        public void testThriceNestedClass() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/inners/ThriceNestedClass.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/tests/javac/qualifiedExpression")
    @TestDataPath("$PROJECT_ROOT")
    public class QualifiedExpression {
        @Test
        public void testAllFilesPresentInQualifiedExpression() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/tests/javac/qualifiedExpression"), Pattern.compile("^(.*)\\.kts?$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
        }

        @Test
        @TestMetadata("GenericClassVsPackage.kt")
        public void testGenericClassVsPackage() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/qualifiedExpression/GenericClassVsPackage.kt");
        }

        @Test
        @TestMetadata("PackageVsClass.kt")
        public void testPackageVsClass() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/qualifiedExpression/PackageVsClass.kt");
        }

        @Test
        @TestMetadata("PackageVsClass2.kt")
        public void testPackageVsClass2() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/qualifiedExpression/PackageVsClass2.kt");
        }

        @Test
        @TestMetadata("PackageVsRootClass.kt")
        public void testPackageVsRootClass() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/qualifiedExpression/PackageVsRootClass.kt");
        }

        @Test
        @TestMetadata("visibleClassVsQualifiedClass.kt")
        public void testVisibleClassVsQualifiedClass() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/qualifiedExpression/visibleClassVsQualifiedClass.kt");
        }
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/tests/javac/typeParameters")
    @TestDataPath("$PROJECT_ROOT")
    public class TypeParameters {
        @Test
        public void testAllFilesPresentInTypeParameters() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/tests/javac/typeParameters"), Pattern.compile("^(.*)\\.kts?$"), Pattern.compile("^(.+)\\.(reversed|fir|ll)\\.kts?$"), true);
        }

        @Test
        @TestMetadata("Clash.kt")
        public void testClash() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/typeParameters/Clash.kt");
        }

        @Test
        @TestMetadata("ComplexCase.kt")
        public void testComplexCase() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/typeParameters/ComplexCase.kt");
        }

        @Test
        @TestMetadata("InheritedInnerAndTypeParameterWithSameNames.kt")
        public void testInheritedInnerAndTypeParameterWithSameNames() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/typeParameters/InheritedInnerAndTypeParameterWithSameNames.kt");
        }

        @Test
        @TestMetadata("InnerWithTypeParameter.kt")
        public void testInnerWithTypeParameter() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/typeParameters/InnerWithTypeParameter.kt");
        }

        @Test
        @TestMetadata("NestedWithInner.kt")
        public void testNestedWithInner() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/typeParameters/NestedWithInner.kt");
        }

        @Test
        @TestMetadata("SeveralInnersWithTypeParameters.kt")
        public void testSeveralInnersWithTypeParameters() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/typeParameters/SeveralInnersWithTypeParameters.kt");
        }

        @Test
        @TestMetadata("TypeParametersInInnerAndOuterWithSameNames.kt")
        public void testTypeParametersInInnerAndOuterWithSameNames() throws Exception {
            runTest("compiler/testData/diagnostics/tests/javac/typeParameters/TypeParametersInInnerAndOuterWithSameNames.kt");
        }
    }
}
