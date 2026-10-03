package TP11

fun main() {
    val estPair = fun(n: Int): Boolean {
        return n % 2 == 0
    }
    for (n in listOf(1, 2, 7, 10)) {
        if (estPair(n)) println("$n est pair") else println("$n est impair")
    }
}