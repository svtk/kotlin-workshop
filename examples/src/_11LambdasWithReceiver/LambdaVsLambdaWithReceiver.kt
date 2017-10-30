package _11LambdasWithReceiver

fun String.lastChar() =
        this.get(this.length - 1)

fun main(args: Array<String>) {
    buildString {
        this.append("...")
    }

    val isEven: (Int) -> Boolean = { it % 2 == 0 }
    val isOdd: Int.() -> Boolean = { this % 2 == 1 }

    isEven(0)
    1.isOdd()

    println(isEven(0))
    println(1.isOdd())
}

inline fun buildString(
        builderAction: StringBuilder.() -> Unit
): String {
    val stringBuilder = StringBuilder()
    stringBuilder.builderAction();
    return stringBuilder.toString()
}