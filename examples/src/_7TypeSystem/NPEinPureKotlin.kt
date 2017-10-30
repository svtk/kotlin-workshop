package _7TypeSystem

class A {
    val foo: String
    init {
        foo = ""
    }

    private fun initialize() {
        println(foo.length)
    }
}

fun main(args: Array<String>) {
    val a = A()
}