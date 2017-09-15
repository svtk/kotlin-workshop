package _10Sequences

fun main(args: Array<String>) {
    val sequence = listOf(1, 2, 3).asSequence()
    for (i in sequence) { }

    val numbers = generateSequence(0) { it + 1 }
    println(numbers.take(5).toList())
}