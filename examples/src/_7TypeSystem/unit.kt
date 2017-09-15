package _7TypeSystem

fun f(): Unit {}

fun g() {}

interface Processor<T> {
    fun process(): T
}

class NoResultProcessor : Processor<Unit> {
    override fun process() {
        // do stuff
    }
}

fun main(args: Array<String>) {
    // This type has only one value 'Unit':
    val u: Unit = Unit
    println(u) // kotlin.Unit
}