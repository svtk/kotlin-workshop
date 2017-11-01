package questions.i_intro

fun main(args: Array<String>) {
    var string = 1
    // the variable string has type Int
//    string = "a"

    val languages = listOf("Java")
    // list is read-only
//    languages.add("Kotlin")

    println(listOf('a', 'b', 'c').joinToString(
            separator = "", prefix = "(", postfix = ")"))
    // (abc)

    println("Kotlin" in "Java".."Scala") // true
    println("Kotlin" in setOf("Java", "Scala"))  // false

    val list = mutableListOf("Kotlin", "Java", "Scala")
    list.sort()
    println(list)

    for (c in '0' until '9') {
        print(c)
    }
    for (c in '0'..'8') {
        print(c)
    }
    // 012345678

}