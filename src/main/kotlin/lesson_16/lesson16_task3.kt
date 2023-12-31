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
Задача 3 к Уроку 13

Скопируй класс из предыдущей задачи с новым уникальным названием. Для того, чтобы взаимодействовать со всеми записями телефонной книги,
как с одним целым, их нужно объединить в список.

Создай пустой список, добавь в него несколько объектов класса-контакта, инициализируя их с разнообразными данными (в том числе и null).

Напиши функцию, которая будет выводить имя, номер телефона и компанию. Если какого-либо значения нет – программа должна заменить его на строку [не указано].
 С помощью этой функции выведи в консоль все объекты из списка. */