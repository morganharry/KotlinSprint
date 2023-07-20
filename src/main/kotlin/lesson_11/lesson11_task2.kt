package lesson_11

fun main() {
    val user1 = User(234, "Fedor", "123456789", "fedor1981@gmail.com")
    do {
        print(
            "Для выполнения задачи введите соотвествующую цифру:\n" +
                    "1 - вывод инфорамции о пользователе\n" +
                    "2 - добавить информацию \"о себе\" \n" +
                    "3 - изменить пароль\n" +
                    "4 - отправить сообщение\n" +
                    "5 - выход\n" +
                    "Ввод: "
        )

        when (readln().toInt()) {
            1 -> user1.printUser()
            2 -> user1.addBio()
            3 -> user1.changePsw()
            4 -> user1.sendToUser()
            else -> break
        }
    } while (true)
}