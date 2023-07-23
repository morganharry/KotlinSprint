package lesson_11

class User(
    val id: Int,
    val login: String,
    var psw: String,
    val mail: String,
    var bio: String = "",
) {
    init {
        println("Зарегестрирован пользователь: ")
        printUser()
    }

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

class Message(
    val id: Int,
    val user: User,
    var message: String,
) {
    init {
        println("На форуме новое сообщение!")
        println()
    }
}


class Forum(
    val id: Int,
    val name: String,
    val usersList: MutableList<User> = mutableListOf(),
    val messageList: MutableList<Message> = mutableListOf(),
) {
    fun createNewUser() {
        val id = usersList.size

        print("Введите имя пользователя: ")
        val login = readln()

        print("Введите пароль: ")
        val psw = readln()

        print("Введите почту: ")
        val mail = readln()

        usersList.add(User(id, login, psw, mail))
    }

    fun createNewMessage(idUser: Int) {
        print("${usersList[idUser].login}, оставьте сообщение: ")

        val message = readln()
        val id = messageList.size

        messageList.add(Message(id, usersList[idUser], message))
    }

    fun printThread() {
        for (message in messageList) {
            println("${message.user.login}: ${message.message}")
            println()
        }
    }
}

fun main() {
    val forum1 = Forum(1, "Exotic dishes of Polynesia")

    forum1.createNewUser()
    forum1.createNewMessage(0)
    forum1.printThread()
}