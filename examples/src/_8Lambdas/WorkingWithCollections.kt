package _8Lambdas.workingWithCollections

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 31), Person("Bob", 29), Person("Carol", 31))
    println(people.associateBy { it.name })
    println(people.associateBy { it.age })
    println(people.groupBy { it.age })

    println(people.find { it.age > 30 })
    println(people.firstOrNull { it.age > 30 })

    val (even, odd) = listOf(1, 2, 3, 4).partition { it % 2 == 0 }
    println(even)
    println(odd)
}