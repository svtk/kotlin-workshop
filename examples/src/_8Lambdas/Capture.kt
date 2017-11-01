package _8Lambdas

fun main(args: Array<String>) {

    val increment = 1
    var sum = 0

    val inc = {
        println(increment)
        sum += increment
    }

    inc()
    inc()
}