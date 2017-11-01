package _7TypeSystem

import classes.Person

fun greetPerson(person: Person) {
    val name = person.name
            ?: throw IllegalArgumentException("Name is unspecified")
    println("Hello, $name!")
}

fun checkTypes(condition: Boolean, expression: Int) {
    val result: Int = if (condition) {
        expression
    } else {
        fail("error")
    }
}

fun fail(message: String): Nothing = throw UnsupportedOperationException(message)

fun example2() {
    val answer: Int = if (timeHasPassed()) {
        42
    } else {
        fail("Something went wrong")
    }
}

fun example3() {
    val answer: Int = if (timeHasPassed()) {
        42
    } else {
        TODO("Something needs to be done")
    }
}

fun timeHasPassed(): Boolean {
    return false
}

fun nullableNothing() {
    val n: Nothing? = null
}

fun foo1(): List<Nothing?> = listOf(null)
