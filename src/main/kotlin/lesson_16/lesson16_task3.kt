package lesson_16

class User(val name: String, private val password: String) {

    fun checkPsw(_password: String): Boolean {
        return (_password == password)
    }
}

fun main() {
    val user1 = User("User2023", "Qwerty")
    do {
        print("Введите пароль от аккаунта ${user1.name}: ")
        if (user1.checkPsw(readln())) {
            println("Пароль совпал!")
            break
        } else println("Увы.")
        print("Еще одна попытка? (да/нет): ")
    } while (readln().equals("да", true))
}