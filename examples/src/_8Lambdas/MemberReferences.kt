package memberReference

class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val list = listOf(
            Person("Alice", 29),
            Person("Bob", 31))

    list.groupBy { it.age }

    list.groupBy(Person::age)
}
