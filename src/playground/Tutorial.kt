package playground

class Tutorial {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Int, b: Int, c: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b} ")
}

fun printSum(a: Int, b: Int, c: Int) {
    println("sum of $a and $b and $c is ${a + b + c} ")
}

fun double(x: Int): Int {
    return 2 * x
}

val result = double(2)

val result2 = Tutorial().sum(1, 2)

fun read(b: Array<Byte>, off: Int = 0, len: Int = b.size) {

}

open class A {
    open fun foo(i: Int = 10) = i * 2
}

class B : A() {
    override fun foo(i: Int) = i * 3
}

fun main(args: Array<String>) {
    println(A().foo())
    println(B().foo())
}

fun foo(bar: Int = 0, baz: Int) {}

val result3 = foo(baz = 1)
// compile error val result3 = foo(1)

fun foo2(bar: Int = 0, baz: Int = 1, qux: () -> Unit) {}

fun foo3(vararg strings: String) {}
val a = foo3("a", "b")
val b = foo3(strings = *arrayOf("a", "b"))

fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello ${name}")
    else
        println("Hi there!")
}

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts)
        result.add(t)
    return result
}

val list = asList(1, 2, 3)


tailrec fun findFixPoint(x: Double = 1.0): Double = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))

fun local() {
    val c: Int = 1
    val d = 2
    val e: Int
    e = 1
    var f = 5
    f += 1
}


fun template() {
    var a = 1
    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is", "was")}, but no is $a"
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}

fun maxOfEx(a: Int, b: Int) = if (a > b) a else b

fun parseInt(str: String): Int? {
    return Integer.parseInt(str)
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    if (x != null && y != null)
        println(x * y)
    else
        println("either '$arg1' or '$arg2' is not a number")
}

fun getStringLength(obj: Any): Int? {
    if (obj is String)
        return obj.length
    else
        return null
}

fun getStringLength2(obj: Any): Int? {
    if (obj !is String)
        return null
    else
        return obj.length
}

fun getStringLength3(obj: Any): Int? {
    if (obj is String && obj.length > 0)
        return obj.length
    else
        return null
}

fun loop() {
    val list = listOf("apple", "banana", "kiwi")
    for (item in list)
        println(item)

}

fun loop2() {
    val items = listOf("apple", "banana", "kiwi")
    var index = 0
    while (index < items.size)
        println("item at $index is ${items[index]}")
}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }


fun range() {
    val x = 10
    val y = 9
    if (x in 1..y + 1)
        println("fits in range")
}

fun check() {
    val list = listOf("a", "b", "c")
    if (-1 in 0..list.lastIndex)
        println("-1 is out of range")
    if (list.size !in list.indices)
        println("list size is out of valid list indices range too")
}

fun iterate() {
    for (x in 1..5)
        print(x)
    for (x in 1..5 step 2)
        print(x)
    for (x in 9 downTo 0 step 3)
        print(x)
    for (x in 9..0 step 3)
        print(x)

}

fun inin() {
    val list = listOf("a")
    when {
        "orange" in list -> println("juicy")
        "apple" in list -> println("apple is fine too")
    }
    list.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}
