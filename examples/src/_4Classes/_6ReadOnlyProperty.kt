package _4Classes

import java.util.*

val foo: Int
    get() = Random().nextInt()

fun main(args: Array<String>) {
    println(foo)
    println(foo)
}