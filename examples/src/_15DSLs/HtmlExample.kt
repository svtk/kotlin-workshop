package _15DSLs

@DslMarker
annotation class HtmlDsl

open class Tag(val name: String) {
    protected val children = mutableListOf<Tag>()

    override fun toString() =
            "<$name>${children.joinToString("")}</$name>"
}

fun table(init: TABLE.() -> Unit): TABLE {
    val table = TABLE()
    table.init()
    return table
}

@HtmlDsl
class TABLE : Tag("table") {
    fun tr(init: TR.() -> Unit) {
        val child = TR()
        child.init()
        children.add(child)
    }
}

@HtmlDsl
class TR : Tag("tr") {
    fun td(init: TD.() -> Unit) {
        val child = TD()
        child.init()
        children.add(child)
    }
}

@HtmlDsl
class TD : Tag("td")

fun createTable(): TABLE {
    return table {
        tr {
            for (i in 1..2) {
                td {
                }
            }
        }
    }
}

fun main(args: Array<String>) {
    println(createTable())
    // <table><tr><td></td><td></td></tr></table>
}