package innerClasses

import innerClasses.A.B

class A {
    class B {
        fun foo() {
            println("B")
            println(this)
            // doesn't compile:
//            println(this@A)
        }
    }

    inner class C {
        fun foo() {
            println("C")
            println(this)
            println(this@A)
        }
    }
}

fun main(args: Array<String>) {
    val a = A()
    val b = B()
    val c = a.C()
    b.foo()
    c.foo()
}