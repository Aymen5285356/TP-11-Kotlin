package TP11

fun main() {
    val list = List(10) { (1..20).random() }
    println(list)
    println(list.filter { it % 2 == 0 })
    println(list.filter { it % 2 != 0 })
    println(list.filter { it > 10 })
}