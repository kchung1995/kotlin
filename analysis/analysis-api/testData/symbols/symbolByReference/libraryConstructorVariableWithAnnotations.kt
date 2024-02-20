// IGNORE_FE10
// MODULE: lib
// MODULE_KIND: LibraryBinary
// FILE: Lib.kt
package one

class SimpleClass(
    @Anno
    @get:Anno
    @set:Anno
    @setparam:Anno
    var constructorVariableWithAnnotations: Long,
)

annotation class Anno

// MODULE: main(lib)
// FILE: usage.kt
fun usage(instance: one.SimpleClass) {
    instance.constru<caret>ctorVariableWithAnnotations
}