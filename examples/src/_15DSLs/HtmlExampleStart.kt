package _15DSLs2


open class Tag(val name: String) {
    protected val children = mutableListOf<Tag>()

    override fun toString() =
            "<$name>${children.joinToString("")}</$name>"
}

fun table(init: TABLE.() -> Unit): TABLE = TABLE()

class TABLE : Tag("table")

fun createTable(): TABLE {
    return table {
/*
        tr {
            for (i in 1..2) {
                td {
                }
            }
        }
*/
    }
}

fun main(args: Array<String>) {
    println(createTable())
    // <table><tr><td></td><td></td></tr></table>
}