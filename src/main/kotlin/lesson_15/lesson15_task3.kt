package lesson_15

abstract class User {
    abstract val name: String
    abstract fun readMessage()
    abstract fun writeMessage()

}

class UserStandart(override val name: String) : User() {
    override fun readMessage() {
        println("Юзер $name читает сообщение.")
    }

    override fun writeMessage() {
        println("Юзер $name пишет сообщение.")
    }
}

class UserAdmin(override val name: String) : User() {
    override fun readMessage() {
        println("Юзер $name читает сообщение.")
    }

    override fun writeMessage() {
        println("Юзер $name пишет сообщение.")
    }

    fun deleteMessage() {
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
/*
Задача 3 к Уроку 15

На форуме есть два вида пользователей – обычные пользователи и администраторы. Пользователи могут читать форум и писать сообщения.
Администраторы могут ещё и удалять сообщения и пользователей. Напиши классы пользователей и администраторов, используя абстрактный класс.
 У абстрактного класса должны быть соответствующие общие поля и методы. Действия на форуме отобрази сообщениями в консоль. */