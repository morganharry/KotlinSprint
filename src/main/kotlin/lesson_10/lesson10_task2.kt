package lesson_10

const val MIN_LENGTH = 4
fun checkLoginAndPasswordLength(str: String) = if (str.length < MIN_LENGTH) {
    println("Логин или пароль недостаточно длинные")
    true
} else {
    println("Логин или пароль одобрены")
    false
}

fun main() {
    do {
        print("Придумайте и введите логин: ")
        val userLogin = readln()
    } while (checkLoginAndPasswordLength(userLogin))

    do {
        print("Придумайте и введите пароль: ")
        val userPsw = readln()
    } while (checkLoginAndPasswordLength(userPsw))
}