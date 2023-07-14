package lesson_7

fun main() {
    do {
        val smsCode = (1000..9999).random()

        println("Ваш код авторизации: $smsCode")
        print("Введите ваш код авторизации: ")

        val userCode = readln().toInt()

        if (userCode == smsCode) println("Добро пожаловать.")
        else println("Неверно.")
    } while (userCode != smsCode)
}
