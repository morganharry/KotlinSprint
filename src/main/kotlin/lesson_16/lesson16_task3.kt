package lesson_16

class User(val name: String = "User2023", private val password: String = "Qwerty") {

    fun checkPsw() {
        do {
            print("Введите пароль от аккаунта $name: ")
            if (readln() == password) {
                println("Пароль совпал!")
                break
            } else println("Увы.")
            print("Еще одна попытка? (да/нет): ")
            if (readln().equals("нет", true)) break
        } while (true)
    }
}

fun main() {
    val user1 = User()
    user1.checkPsw()
}