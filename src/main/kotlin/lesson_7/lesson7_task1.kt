package lesson_7

fun main() {
    val char1 = (('0'..'9') + ('a'..'z')).random()
    val char2 = (('0'..'9') + ('a'..'z')).random()
    val char3 = (('0'..'9') + ('a'..'z')).random()
    val char4 = (('0'..'9') + ('a'..'z')).random()
    val char5 = (('0'..'9') + ('a'..'z')).random()
    val char6 = (('0'..'9') + ('a'..'z')).random()

    println(char1.toString() + char2 + char3 + char4 + char5 + char6)
}