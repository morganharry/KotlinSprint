package lesson_7

fun main() {
    println("Введите необходимую длину пароля: ")
    val userPassSize = readln().toInt()
    var password = ""

    for (i in 0 until userPassSize) {
        val char = (('0'..'9') + ('A'..'Z') + ('a'..'z')).random()
        password += char
    }
    println(password)
}