package lesson_11

class UserClass(
    val id: Int,
    val login: String,
    val psw: String,
    val mail: String,
) {
    fun userPrint() {
        println("id: ${String.format("%06d", id)}, login: ${login}, password: ${psw}, mail: ${mail}")
    }
}
fun main() {
    val user1 = UserClass(42, "Silvestr", "Hf55hjdjdj", "silvestr@gmail.com")
    val user2 = UserClass(1443, "Vasiliy", "ghg7hD7hjk", "vas1986@gmail.com")

    user1.userPrint()
    user2.userPrint()
}

/*
В аннотации к уроку я упоминаю создавать классы в одном файле. Перемести плиз)

 */
/*
Задача 1 к Уроку 11

Создай класс, который будет хранить данные пользователя. В свойствах должна храниться информация об уникальном
 идентификаторе, логине, пароле и почте. Названием может быть, например, User. Создай два экземпляра класса с
 произвольными данными и выведи их в консоль.*/



