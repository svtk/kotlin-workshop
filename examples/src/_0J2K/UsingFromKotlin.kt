package _0J2K

fun main(args: Array<String>) {
    val jPerson = JPerson("Alice", 29)
    jPerson.name
    jPerson.age = jPerson.age + 1

    val kPerson = KPerson("Alice", 29)
    kPerson.name
    kPerson.age++
}