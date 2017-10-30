package _8Lambdas

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    list.any {
        println("processing $it")
        it > 0
    }
}