package TP11

class NegativeNumberException(message: String) : Exception(message)

fun convertToInt(s: String): Int? {
    try {
        val n = s.toInt()
        if (n < 0) throw NegativeNumberException("Nombre negatif")
        return n
    } catch (e: NumberFormatException) {
        println("Erreur : pas un nombre")
    } catch (e: NegativeNumberException) {
        println("Erreur : ${e.message}")
    }
    return null
}

fun main() {
    println(convertToInt("42"))
    println(convertToInt("abc"))
    println(convertToInt("-5"))
}