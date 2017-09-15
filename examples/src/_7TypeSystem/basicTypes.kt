package _7TypeSystem

// Call "Show Kotlin Bytecode" action.
// You may call "Decompile" to look at the corresponding Java code.

// int getInt();
fun getInt(): Int = 1

// java.lang.Integer getNullableInt();
fun getNullableInt(): Int? = null

// java.util.List<java.lang.Integer> getListOfInts();
fun getListOfInts(): List<Int> = listOf(1, 2, 3)

// String[] getArray();
fun getArray(): Array<String> = arrayOf("ab", "cd")

// java.lang.Object getAny();
fun getAny(): Any = 1

// java.lang.String getString();
fun getString(): String = ""