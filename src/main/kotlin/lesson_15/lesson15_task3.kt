package lesson_15

abstract class User {
    abstract val name:String
    abstract fun readMessage()
    abstract fun writeMessage()

}

class UserStandart (override val name:String):User() {
    override fun readMessage () {
        println("Юзер $name читает сообщение.")
    }
    override fun writeMessage () {
        println("Юзер $name пишет сообщение.")
    }
}

class UserAdmin (override val  name:String):User() {
    override fun readMessage () {
        println("Юзер $name читает сообщение.")
    }
    override fun writeMessage () {
        println("Юзер $name пишет сообщение.")
    }
    fun deleteMessage () {
    println("Юзер $name удаляет сообщение.")
    }
}

fun main() {
    val admin = UserAdmin("Админ")
    val user = UserStandart("Простой пользователь")

    admin.readMessage()
    admin.writeMessage()
    admin.deleteMessage()
    println()
    user.writeMessage()
    user.readMessage()
}