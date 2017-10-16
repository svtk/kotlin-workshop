package _11LambdasWithReceiver

fun main(args: Array<String>) {
    println(useWith())
    println(useApply())
    println(useAlso())
}

fun useWith() = with(StringBuilder()) {
    appendln("Alphabet: ")
    for (c in 'a'..'z') {
        append(c)
    }
    toString()
}

fun useApply() = StringBuilder().apply {
    appendln("Alphabet: ")
    for (c in 'a'..'z') {
        append(c)
    }
}.toString()

fun useAlso(): String = StringBuilder().also {
    it.appendln("Alphabet: ")
    for (c in 'a'..'z') {
        it.append(c)
    }
}.toString()