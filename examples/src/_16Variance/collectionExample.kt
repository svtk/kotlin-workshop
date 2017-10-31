package _16Variance

fun main(args: Array<String>) {

    val strings = mutableListOf("abc", "cde")
    doSomethingWithList(strings as MutableList<Any>)

    for (string in strings) {
        println(string)
    }
}

fun doSomethingWithList(list: MutableList<Any>) {
    list.add(2)
}