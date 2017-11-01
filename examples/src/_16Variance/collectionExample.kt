package _16Variance

fun main(args: Array<String>) {
    val strings = mutableListOf("abc", "cde")
    @Suppress("UNCHECKED_CAST")
    doSomethingWithList(strings as MutableList<Any>)

    for (string in strings) {

    }
}

fun doSomethingWithList(list: MutableList<Any>) {
    list.add(1)
}

interface MyMutableList<out T> {
    fun get(): T
//    fun add(t: T)
}
