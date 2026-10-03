package TP11

fun calculate(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

fun main() {
    println(calculate(10, 5) { x, y -> x + y })
    println(calculate(10, 5) { x, y -> x - y })
    println(calculate(10, 5) { x, y -> x * y })
}