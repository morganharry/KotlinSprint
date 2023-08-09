package lesson_15

abstract class Message {
    abstract val data: Int
    abstract fun sendMessage()
}

class MessageTemperature(override val data: Int) : Message() {
    override fun sendMessage() {
        println("Температура: $data°")
    }
}

class MessagePrecipitation(override val data: Int) : Message() {
    override fun sendMessage() {
        println("Осадки: $data мм")
    }
}

fun main() {
    print("Введите данные по температуре: ")
    val temperature = MessageTemperature(readln().toInt())
    temperature.sendMessage()
    println()
    print("Введите данные по осадкам: ")
    val precipitation = MessagePrecipitation(readln().toInt())
    precipitation.sendMessage()
}
/*
Задача 2 к Уроку 15

Программа, управляющая погодной станцией, должна отправлять сообщения на сервер. Напиши абстрактный класс базового
сообщения с возможностью подключиться к серверу и отправить данные. Итого будет два метода и одно поле абстрактного класса.
Затем создай подклассы сообщений о температуре и количестве осадков. Протестируй работу программы. */