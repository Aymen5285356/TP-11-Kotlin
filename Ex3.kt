package TP11

fun main() {
    val numbers = listOf(10, 20, 30, 40, 50, 60)
    val somme = fun(l: List<Int>): Int {
        return l.sum()
    }
    println(somme(numbers))
}