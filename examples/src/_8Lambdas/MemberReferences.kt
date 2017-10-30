package memberReference

class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(
            Person("Alice", 29),
            Person("Bob", 31))

    people.maxBy { it.age }

    people.maxBy(Person::age)

    val list = listOf(1, 2, 3, 4)

    list.any(::isEven)

    list.filter(::isEven)
}

fun isEven(i: Int): Boolean = i % 2 == 0
