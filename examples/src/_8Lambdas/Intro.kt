package _8Lambdas

fun main(args: Array<String>) {
    val list = listOf(1, 8, 33, 42)

    // only even numbers
    val even = mutableListOf<Int>()
    for (i in list) {
        if (i % 2 == 0) {
            even += i
        }
    }

    // only numbers > 10
    val moreThan10 = mutableListOf<Int>()
    for (i in list) {
        if (i > 10) {
            moreThan10 += i
        }
    }

    println(even)
    println(moreThan10)

    println(list.filter { it % 2 == 0 })
    println(list.filter { it > 10 })
}