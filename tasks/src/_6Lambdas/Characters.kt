package _6Lambdas

import _6Lambdas.Gender.FEMALE
import _6Lambdas.Gender.MALE

class Character(val name: String, val age: Int, val gender: Gender?)
enum class Gender { MALE, FEMALE }

fun main(args: Array<String>) {
    val characters = listOf(
            Character("The Captain", 60, MALE),
            Character("Frenchy", 42, MALE),
            Character("The Kid", 9, null),
            Character("Lady Lauren", 29, FEMALE),
            Character("First Mate", 29, MALE),
            Character("Sir Stephen", 37, MALE))

    println(characters.last().name)

    println(characters.firstOrNull { it.age == 30 }?.name)
    println(characters.last { it.age == 29 }.name)

    println(characters.map { it.age }.distinct().size)
    println(characters.filter { it.age < 30 }.size)

    val (youngest, oldest) = characters.partition { it.age < 30 }
    println(oldest.size)
    println(youngest.size)

    println(characters.maxBy { it.age }?.name)

    println(characters.all { it.age < 50 })
    println(characters.any { it.gender == FEMALE })


    val mapByAge: Map<Int, List<Character>> = characters.groupBy { it.age }
    val (age, group) = mapByAge.maxBy { (_, group) -> group.size }!!
    println(age)
    println(group.size)

    val mapByName: Map<String, Character> = characters.associateBy { it.name }
    println(mapByName["Frenchy"]?.age)
    println(mapByName.getValue("Frenchy").age)
    println(mapByName["unknown"])

    val unknownCharacter = Character("Unknown", 0, null)
    println(mapByName.getOrElse("unknown") { unknownCharacter }.age)

    val (first, second) = characters
            .flatMap { first -> characters.map { second -> first to second } }
            .maxBy { (first, second) -> first.age - second.age }!!
    println(first.name)
    println(second.name)
}