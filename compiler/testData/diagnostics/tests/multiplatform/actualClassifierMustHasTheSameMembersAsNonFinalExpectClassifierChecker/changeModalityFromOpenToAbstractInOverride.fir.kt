// MODULE: m1-common
// FILE: common.kt
interface Base {
    fun foo() {}
}
<!INCOMPATIBLE_MATCHING{JVM}, INCOMPATIBLE_MATCHING{JVM}!>expect abstract class Foo() : Base<!>


// MODULE: m2-jvm()()(m1-common)
// FILE: jvm.kt

actual abstract class Foo : Base {
    abstract override fun foo()
}
