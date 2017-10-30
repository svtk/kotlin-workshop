package _7TypeSystem

fun main(args: Array<String>) {
    val mutableList = mutableListOf(1, 2, 3)
    val list: List<Int> = mutableList

    println(list)  // [1, 2, 3]
    mutableList.add(4)
    println(list)  // [1, 2, 3, 4]
}