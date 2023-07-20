package lesson_11

class User(
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