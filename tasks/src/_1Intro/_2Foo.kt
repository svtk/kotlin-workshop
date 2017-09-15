package questions.i_intro

val foo1 = run {
    println("Calculating foo...")
    "foo"
}

fun foo2(): String {
    println("Calculating foo...")
    return "foo"
}

fun main(args: Array<String>) {
    println("First $foo1, second $foo1")
    println("------")
    println("First ${foo2()}, second ${foo2()}")
}