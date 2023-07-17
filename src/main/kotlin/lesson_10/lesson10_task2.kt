package lesson_10

const val MIN_LENGTH = 4

fun loginAndPswChecker(str: String): Boolean {
    return if (str.length < MIN_LENGTH) {
        println("Логин или пароль недостаточно длинные")
        true
    } else {
        println("Логин или пароль одобрены")
        false
    }
}

fun main() {
    do {
        print("Придумайте и введите логин: ")
        val userLogin = readln()
    } while (loginAndPswChecker(userLogin))

    do {
        print("Придумайте и введите пароль: ")
        val userPsw = readln()
    } while (loginAndPswChecker(userPsw))
}