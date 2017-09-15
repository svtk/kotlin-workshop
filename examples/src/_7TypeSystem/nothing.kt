package _7TypeSystem

fun example1(condition: Boolean, expression: Int) {
    val result = if (condition) {
        expression
    } else {
        fail("error")
    }
}

fun fail(message: String): Nothing = throw UnsupportedOperationException(message)

fun example2(condition: Boolean, expression: Int) {
    val result = if (condition) {
        expression
    } else {
        return
    }
}