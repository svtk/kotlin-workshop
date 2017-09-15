package _5Objects

interface Factory<T> {
    fun create(): T
}

// Companion object can implement an interface
class A {
    private constructor()

    companion object : Factory<A> {
        override fun create(): A {
            return A()
        }
    }
}

class B {
    companion object {
        // use annotation to make a member static
        @JvmStatic
        fun staticFunction() {}
    }
}