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
/*
давай сделаем чтобы метод возвращал Boolean, а все остальное в main, так метод станет более универсальным

не совсем логично. нужно понимать, что класс – это всего лишь шаблон/чертеж для будущих объектов.
он не может хранить логин и пароль какого-то конкретного пользователя
 */

/*
* */