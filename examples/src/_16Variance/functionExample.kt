package _16Variance

val animalsCache = mutableMapOf<Animal, Int>()
val catsCache = mutableMapOf<Cat, Int>()

open class Animal
class Cat: Animal()
class Dog: Animal()

fun universalNumbering(animal: Animal): Int = animalsCache.getOrPut(animal) { animalsCache.size + 1 }
fun catsNumbering(cat: Cat): Int = catsCache.getOrPut(cat) { catsCache.size + 1 }

fun main(args: Array<String>) {
    enumerateCats(::universalNumbering)
//    enumerateAnimals(::catsNumbering)
}

fun enumerateCats(f: (Cat) -> Int) {
    f(Cat())
}

fun enumerateAnimals(f: (Any) -> Int) {
    f(Cat())
    f(Dog())
}

interface MyFunction<P, R> {
    fun invoke(p: P): R
}