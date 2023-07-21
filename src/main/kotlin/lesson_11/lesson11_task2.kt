package lesson_11

class Users(
    val id: Int,
    val login: String,
    var psw: String,
    val mail: String,
    var bio: String = "",

    ) {
    fun printUser() {
        println("id: ${String.format("%06d", id)}, login: ${login}, password: ${psw}, mail: ${mail}, bio: ${bio}")
        println()
    }

    fun addBio() {
        print("Введите информацию \"о себе\":")
        bio = readln()
        println()
    }

    fun changePsw() {
        do {
            print("Введите текущий пароль: ")
            if (readln() == psw) break
            else println("Пароль неверный!")
        } while (true)
        print("Введите новый пароль: ")
        psw = readln()
        println("Новый пароль установлен.")
        println()
    }

    fun sendToUser() {
        print("Введите сообщение для пользователя ${login}: ")
        val message = readln()
        println("${login}, вам сообщение:\n\"${message}\"")
        println()
    }
}
fun main() {
    val user1 = Users(234, "Fedor", "123456789", "fedor1981@gmail.com")
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