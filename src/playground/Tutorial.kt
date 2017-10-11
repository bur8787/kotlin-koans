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

fun <T>  asList(vararg ts:T):List<T>{
    val result = ArrayList<T>()
    for (t in ts)
        result.add(t)
    return  result
}

val list = asList(1,2,3,)


tailrec fun findFixPoint(x: Double = 1.0): Double = if(x == Math.cos(x)) x else findFixPoint(Math.cos(x))
