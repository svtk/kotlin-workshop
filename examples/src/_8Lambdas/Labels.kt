package _8Lambdas

data class Person(val name: String, val age: Int)

fun lookForAlice(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") return@forEach
    }
    println("Alice might be somewhere")
}

fun lookForAlice1(people: List<Person>) {
    people.filter(fun (person): Boolean {
        if (person.name == "Alice") return true
        println("${person.name} is not Alice")
        return false
    })
}