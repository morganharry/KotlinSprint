package lesson_7

fun main() {
    val rangeChar = ('a'..'z')
    val rangeInt = (0..9)
    val char1 = rangeChar.random()
    val char2 = rangeInt.random()
    val char3 = rangeChar.random()
    val char4 = rangeInt.random()
    val char5 = rangeChar.random()
    val char6 = rangeInt.random()

    println(char1.toString() + char2 + char3 + char4 + char5 + char6)
}