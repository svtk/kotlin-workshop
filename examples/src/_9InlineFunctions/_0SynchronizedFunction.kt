package _9InlineFunctions

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

fun foo(lock: Lock) {
    synchronized(lock) {
        println("Action")
    }
}

fun __foo__(lock: Lock) {
    lock.lock()
    try {
        println("Action")
    } finally {
        lock.unlock()
    }
}

fun main(args: Array<String>) {

    val l = ReentrantLock()

    synchronized(l) {
        // ...
    }

    l.withLock {
        // ...
    }
}