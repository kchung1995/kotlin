/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.wasm.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateWasmTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
public class K1WasmJsTranslatorTestGenerated extends AbstractK1WasmJsTranslatorTest {
  @Nested
  @TestMetadata("js/js.translator/testData/box/main")
  @TestDataPath("$PROJECT_ROOT")
  public class Main {
    @Test
    public void testAllFilesPresentInMain() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/box/main"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.WASM, true);
    }

    @Test
    @TestMetadata("differentMains.kt")
    public void testDifferentMains() {
      runTest("js/js.translator/testData/box/main/differentMains.kt");
    }

    @Test
    @TestMetadata("incremental.kt")
    public void testIncremental() {
      runTest("js/js.translator/testData/box/main/incremental.kt");
    }

    @Test
    @TestMetadata("noArgs.kt")
    public void testNoArgs() {
      runTest("js/js.translator/testData/box/main/noArgs.kt");
    }

    @Test
    @TestMetadata("simple.kt")
    public void testSimple() {
      runTest("js/js.translator/testData/box/main/simple.kt");
    }

    @Test
    @TestMetadata("suspendMain.kt")
    public void testSuspendMain() {
      runTest("js/js.translator/testData/box/main/suspendMain.kt");
    }

    @Test
    @TestMetadata("suspendMainNoArgs.kt")
    public void testSuspendMainNoArgs() {
      runTest("js/js.translator/testData/box/main/suspendMainNoArgs.kt");
    }

    @Test
    @TestMetadata("suspendMainThrows.kt")
    public void testSuspendMainThrows() {
      runTest("js/js.translator/testData/box/main/suspendMainThrows.kt");
    }

    @Test
    @TestMetadata("twoMains.kt")
    public void testTwoMains() {
      runTest("js/js.translator/testData/box/main/twoMains.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/box/native")
  @TestDataPath("$PROJECT_ROOT")
  public class Native {
    @Test
    @TestMetadata("accessToCompanionObjectFromInlineFun.kt")
    public void testAccessToCompanionObjectFromInlineFun() {
      runTest("js/js.translator/testData/box/native/accessToCompanionObjectFromInlineFun.kt");
    }

    @Test
    public void testAllFilesPresentInNative() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/box/native"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.WASM, true);
    }

    @Test
    @TestMetadata("castToNativeClassChecked.kt")
    public void testCastToNativeClassChecked() {
      runTest("js/js.translator/testData/box/native/castToNativeClassChecked.kt");
    }

    @Test
    @TestMetadata("castToNativeInterface.kt")
    public void testCastToNativeInterface() {
      runTest("js/js.translator/testData/box/native/castToNativeInterface.kt");
    }

    @Test
    @TestMetadata("castToNativeInterfaceChecked.kt")
    public void testCastToNativeInterfaceChecked() {
      runTest("js/js.translator/testData/box/native/castToNativeInterfaceChecked.kt");
    }

    @Test
    @TestMetadata("castToNullableNativeInterface.kt")
    public void testCastToNullableNativeInterface() {
      runTest("js/js.translator/testData/box/native/castToNullableNativeInterface.kt");
    }

    @Test
    @TestMetadata("castToTypeParamBoundedByNativeInterface.kt")
    public void testCastToTypeParamBoundedByNativeInterface() {
      runTest("js/js.translator/testData/box/native/castToTypeParamBoundedByNativeInterface.kt");
    }

    @Test
    @TestMetadata("class.kt")
    public void testClass() {
      runTest("js/js.translator/testData/box/native/class.kt");
    }

    @Test
    @TestMetadata("classObject.kt")
    public void testClassObject() {
      runTest("js/js.translator/testData/box/native/classObject.kt");
    }

    @Test
    @TestMetadata("externalValWithOverridenVar.kt")
    public void testExternalValWithOverridenVar() {
      runTest("js/js.translator/testData/box/native/externalValWithOverridenVar.kt");
    }

    @Test
    @TestMetadata("kt2209.kt")
    public void testKt2209() {
      runTest("js/js.translator/testData/box/native/kt2209.kt");
    }

    @Test
    @TestMetadata("nestedElements.kt")
    public void testNestedElements() {
      runTest("js/js.translator/testData/box/native/nestedElements.kt");
    }

    @Test
    @TestMetadata("objectFunWithVararg.kt")
    public void testObjectFunWithVararg() {
      runTest("js/js.translator/testData/box/native/objectFunWithVararg.kt");
    }

    @Test
    @TestMetadata("passExtLambdaToNative.kt")
    public void testPassExtLambdaToNative() {
      runTest("js/js.translator/testData/box/native/passExtLambdaToNative.kt");
    }

    @Test
    @TestMetadata("passMemberOrExtFromNative.kt")
    public void testPassMemberOrExtFromNative() {
      runTest("js/js.translator/testData/box/native/passMemberOrExtFromNative.kt");
    }

    @Test
    @TestMetadata("passMemberOrExtToNative.kt")
    public void testPassMemberOrExtToNative() {
      runTest("js/js.translator/testData/box/native/passMemberOrExtToNative.kt");
    }

    @Test
    @TestMetadata("passTopLevelFunctionFromNative.kt")
    public void testPassTopLevelFunctionFromNative() {
      runTest("js/js.translator/testData/box/native/passTopLevelFunctionFromNative.kt");
    }

    @Test
    @TestMetadata("passTopLevelOrLocalFunctionToNative.kt")
    public void testPassTopLevelOrLocalFunctionToNative() {
      runTest("js/js.translator/testData/box/native/passTopLevelOrLocalFunctionToNative.kt");
    }

    @Test
    @TestMetadata("privateExternal.kt")
    public void testPrivateExternal() {
      runTest("js/js.translator/testData/box/native/privateExternal.kt");
    }

    @Test
    @TestMetadata("safeCastToNativeInterface.kt")
    public void testSafeCastToNativeInterface() {
      runTest("js/js.translator/testData/box/native/safeCastToNativeInterface.kt");
    }

    @Test
    @TestMetadata("secondaryConstructor.kt")
    public void testSecondaryConstructor() {
      runTest("js/js.translator/testData/box/native/secondaryConstructor.kt");
    }

    @Test
    @TestMetadata("simple.kt")
    public void testSimple() {
      runTest("js/js.translator/testData/box/native/simple.kt");
    }

    @Test
    @TestMetadata("simpleUndefined.kt")
    public void testSimpleUndefined() {
      runTest("js/js.translator/testData/box/native/simpleUndefined.kt");
    }

    @Test
    @TestMetadata("useClassFromInlineFun.kt")
    public void testUseClassFromInlineFun() {
      runTest("js/js.translator/testData/box/native/useClassFromInlineFun.kt");
    }

    @Test
    @TestMetadata("vararg.kt")
    public void testVararg() {
      runTest("js/js.translator/testData/box/native/vararg.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/box/esModules")
  @TestDataPath("$PROJECT_ROOT")
  public class EsModules {
    @Test
    public void testAllFilesPresentInEsModules() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/box/esModules"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.WASM, true, "jsExport", "native", "export", "crossModuleRef", "crossModuleRefPerFile", "crossModuleRefPerModule");
    }

    @Nested
    @TestMetadata("js/js.translator/testData/box/esModules/incremental")
    @TestDataPath("$PROJECT_ROOT")
    public class Incremental {
      @Test
      public void testAllFilesPresentInIncremental() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/box/esModules/incremental"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.WASM, true);
      }

      @Test
      @TestMetadata("jsModule.kt")
      public void testJsModule() {
        runTest("js/js.translator/testData/box/esModules/incremental/jsModule.kt");
      }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/box/esModules/inline")
    @TestDataPath("$PROJECT_ROOT")
    public class Inline {
      @Test
      public void testAllFilesPresentInInline() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/box/esModules/inline"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.WASM, true);
      }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/box/esModules/jsModule")
    @TestDataPath("$PROJECT_ROOT")
    public class JsModule {
      @Test
      public void testAllFilesPresentInJsModule() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/box/esModules/jsModule"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.WASM, true);
      }

      @Test
      @TestMetadata("externalClass.kt")
      public void testExternalClass() {
        runTest("js/js.translator/testData/box/esModules/jsModule/externalClass.kt");
      }

      @Test
      @TestMetadata("externalClassNameClash.kt")
      public void testExternalClassNameClash() {
        runTest("js/js.translator/testData/box/esModules/jsModule/externalClassNameClash.kt");
      }

      @Test
      @TestMetadata("externalFunction.kt")
      public void testExternalFunction() {
        runTest("js/js.translator/testData/box/esModules/jsModule/externalFunction.kt");
      }

      @Test
      @TestMetadata("externalFunctionNameClash.kt")
      public void testExternalFunctionNameClash() {
        runTest("js/js.translator/testData/box/esModules/jsModule/externalFunctionNameClash.kt");
      }

      @Test
      @TestMetadata("externalObject.kt")
      public void testExternalObject() {
        runTest("js/js.translator/testData/box/esModules/jsModule/externalObject.kt");
      }

      @Test
      @TestMetadata("externalPackage.kt")
      public void testExternalPackage() {
        runTest("js/js.translator/testData/box/esModules/jsModule/externalPackage.kt");
      }

      @Test
      @TestMetadata("externalPackageInDifferentFile.kt")
      public void testExternalPackageInDifferentFile() {
        runTest("js/js.translator/testData/box/esModules/jsModule/externalPackageInDifferentFile.kt");
      }

      @Test
      @TestMetadata("externalProperty.kt")
      public void testExternalProperty() {
        runTest("js/js.translator/testData/box/esModules/jsModule/externalProperty.kt");
      }

      @Test
      @TestMetadata("interfaces.kt")
      public void testInterfaces() {
        runTest("js/js.translator/testData/box/esModules/jsModule/interfaces.kt");
      }

      @Test
      @TestMetadata("topLevelVarargFun.kt")
      public void testTopLevelVarargFun() {
        runTest("js/js.translator/testData/box/esModules/jsModule/topLevelVarargFun.kt");
      }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/box/esModules/jsName")
    @TestDataPath("$PROJECT_ROOT")
    public class JsName {
      @Test
      public void testAllFilesPresentInJsName() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/box/esModules/jsName"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.WASM, true);
      }

      @Test
      @TestMetadata("defaultJsName.kt")
      public void testDefaultJsName() {
        runTest("js/js.translator/testData/box/esModules/jsName/defaultJsName.kt");
      }

      @Test
      @TestMetadata("jsTopLevelClashes.kt")
      public void testJsTopLevelClashes() {
        runTest("js/js.translator/testData/box/esModules/jsName/jsTopLevelClashes.kt");
      }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/box/esModules/kotlin.test")
    @TestDataPath("$PROJECT_ROOT")
    public class Kotlin_test {
      @Test
      public void testAllFilesPresentInKotlin_test() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/box/esModules/kotlin.test"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.WASM, true);
      }

      @Test
      @TestMetadata("beforeAfter.kt")
      public void testBeforeAfter() {
        runTest("js/js.translator/testData/box/esModules/kotlin.test/beforeAfter.kt");
      }

      @Test
      @TestMetadata("ignore.kt")
      public void testIgnore() {
        runTest("js/js.translator/testData/box/esModules/kotlin.test/ignore.kt");
      }

      @Test
      @TestMetadata("illegalParameters.kt")
      public void testIllegalParameters() {
        runTest("js/js.translator/testData/box/esModules/kotlin.test/illegalParameters.kt");
      }

      @Test
      @TestMetadata("incremental.kt")
      public void testIncremental() {
        runTest("js/js.translator/testData/box/esModules/kotlin.test/incremental.kt");
      }

      @Test
      @TestMetadata("inherited.kt")
      public void testInherited() {
        runTest("js/js.translator/testData/box/esModules/kotlin.test/inherited.kt");
      }

      @Test
      @TestMetadata("mpp.kt")
      public void testMpp() {
        runTest("js/js.translator/testData/box/esModules/kotlin.test/mpp.kt");
      }

      @Test
      @TestMetadata("nested.kt")
      public void testNested() {
        runTest("js/js.translator/testData/box/esModules/kotlin.test/nested.kt");
      }

      @Test
      @TestMetadata("returnTestResult.kt")
      public void testReturnTestResult() {
        runTest("js/js.translator/testData/box/esModules/kotlin.test/returnTestResult.kt");
      }

      @Test
      @TestMetadata("simple.kt")
      public void testSimple() {
        runTest("js/js.translator/testData/box/esModules/kotlin.test/simple.kt");
      }
    }

    @Nested
    @TestMetadata("js/js.translator/testData/box/esModules/main")
    @TestDataPath("$PROJECT_ROOT")
    public class Main {
      @Test
      public void testAllFilesPresentInMain() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/box/esModules/main"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.WASM, true);
      }

      @Test
      @TestMetadata("differentMains.kt")
      public void testDifferentMains() {
        runTest("js/js.translator/testData/box/esModules/main/differentMains.kt");
      }

      @Test
      @TestMetadata("incremental.kt")
      public void testIncremental() {
        runTest("js/js.translator/testData/box/esModules/main/incremental.kt");
      }

      @Test
      @TestMetadata("noArgs.kt")
      public void testNoArgs() {
        runTest("js/js.translator/testData/box/esModules/main/noArgs.kt");
      }

      @Test
      @TestMetadata("simple.kt")
      public void testSimple() {
        runTest("js/js.translator/testData/box/esModules/main/simple.kt");
      }

      @Test
      @TestMetadata("suspendMain.kt")
      public void testSuspendMain() {
        runTest("js/js.translator/testData/box/esModules/main/suspendMain.kt");
      }

      @Test
      @TestMetadata("suspendMainNoArgs.kt")
      public void testSuspendMainNoArgs() {
        runTest("js/js.translator/testData/box/esModules/main/suspendMainNoArgs.kt");
      }

      @Test
      @TestMetadata("suspendMainThrows.kt")
      public void testSuspendMainThrows() {
        runTest("js/js.translator/testData/box/esModules/main/suspendMainThrows.kt");
      }

      @Test
      @TestMetadata("twoMains.kt")
      public void testTwoMains() {
        runTest("js/js.translator/testData/box/esModules/main/twoMains.kt");
      }
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/box/jsQualifier")
  @TestDataPath("$PROJECT_ROOT")
  public class JsQualifier {
    @Test
    public void testAllFilesPresentInJsQualifier() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/box/jsQualifier"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.WASM, true);
    }

    @Test
    @TestMetadata("classes.kt")
    public void testClasses() {
      runTest("js/js.translator/testData/box/jsQualifier/classes.kt");
    }

    @Test
    @TestMetadata("interfaces.kt")
    public void testInterfaces() {
      runTest("js/js.translator/testData/box/jsQualifier/interfaces.kt");
    }

    @Test
    @TestMetadata("simple.kt")
    public void testSimple() {
      runTest("js/js.translator/testData/box/jsQualifier/simple.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/box/reflection")
  @TestDataPath("$PROJECT_ROOT")
  public class Reflection {
    @Test
    public void testAllFilesPresentInReflection() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/box/reflection"), Pattern.compile("^(findAssociatedObject(InSeparatedFile)?(Lazyness)?)\\.kt$"), null, TargetBackend.WASM, true);
    }

    @Test
    @TestMetadata("findAssociatedObject.kt")
    public void testFindAssociatedObject() {
      runTest("js/js.translator/testData/box/reflection/findAssociatedObject.kt");
    }

    @Test
    @TestMetadata("findAssociatedObjectInSeparatedFile.kt")
    public void testFindAssociatedObjectInSeparatedFile() {
      runTest("js/js.translator/testData/box/reflection/findAssociatedObjectInSeparatedFile.kt");
    }

    @Test
    @TestMetadata("findAssociatedObjectLazyness.kt")
    public void testFindAssociatedObjectLazyness() {
      runTest("js/js.translator/testData/box/reflection/findAssociatedObjectLazyness.kt");
    }
  }

  @Nested
  @TestMetadata("js/js.translator/testData/box/kotlin.test")
  @TestDataPath("$PROJECT_ROOT")
  public class Kotlin_test {
    @Test
    public void testAllFilesPresentInKotlin_test() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/box/kotlin.test"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.WASM, true);
    }

    @Test
    @TestMetadata("beforeAfter.kt")
    public void testBeforeAfter() {
      runTest("js/js.translator/testData/box/kotlin.test/beforeAfter.kt");
    }

    @Test
    @TestMetadata("ignore.kt")
    public void testIgnore() {
      runTest("js/js.translator/testData/box/kotlin.test/ignore.kt");
    }

    @Test
    @TestMetadata("illegalParameters.kt")
    public void testIllegalParameters() {
      runTest("js/js.translator/testData/box/kotlin.test/illegalParameters.kt");
    }

    @Test
    @TestMetadata("incremental.kt")
    public void testIncremental() {
      runTest("js/js.translator/testData/box/kotlin.test/incremental.kt");
    }

    @Test
    @TestMetadata("inherited.kt")
    public void testInherited() {
      runTest("js/js.translator/testData/box/kotlin.test/inherited.kt");
    }

    @Test
    @TestMetadata("mpp.kt")
    public void testMpp() {
      runTest("js/js.translator/testData/box/kotlin.test/mpp.kt");
    }

    @Test
    @TestMetadata("nested.kt")
    public void testNested() {
      runTest("js/js.translator/testData/box/kotlin.test/nested.kt");
    }

    @Test
    @TestMetadata("returnTestResult.kt")
    public void testReturnTestResult() {
      runTest("js/js.translator/testData/box/kotlin.test/returnTestResult.kt");
    }

    @Test
    @TestMetadata("simple.kt")
    public void testSimple() {
      runTest("js/js.translator/testData/box/kotlin.test/simple.kt");
    }
  }
}
