package _8Lambdas

fun main(args: Array<String>) {
    val map = mapOf(1 to "one", 2 to "two")
    map.mapValues { (key, value) -> "$key -> $value!" }
}