package lesson_7

fun main() {
    var password = ""
    for (i in 1..6) {
        val char = (('0'..'9') + ('a'..'z')).random()
        password += char
    }
    println(password)
}