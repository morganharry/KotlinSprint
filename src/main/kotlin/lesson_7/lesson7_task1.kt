package lesson_7

fun main() {
    val range = (('0'..'9') + ('a'..'z'))
    val char1 = range.random()
    val char2 = range.random()
    val char3 = range.random()
    val char4 = range.random()
    val char5 = range.random()
    val char6 = range.random()

    println(char1.toString() + char2 + char3 + char4 + char5 + char6)
}