package TP11

fun divide(a: Int, b: Int): Int? {
    try {
        return a / b
    } catch (e: ArithmeticException) {
        println("Erreur : division par zero")
        return null
    }
}

fun main() {
    println(divide(10, 2))
    println(divide(10, 0))
}