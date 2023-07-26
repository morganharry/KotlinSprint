package lesson_15

abstract class Message {
    abstract val data: Int
    abstract fun sendMessage ()
}

class MessageTemperature (override val data: Int) :Message () {
    override fun sendMessage () {
        println("Температура: $data°")
    }
}

class MessagePrecipitation (override val data: Int) :Message () {
    override fun sendMessage () {
        println("Осадки: $data мм")
    }
}

fun main() {
    print("Введите данные по температуре: ")
    val temperature = MessageTemperature(readln().toInt())
    temperature.sendMessage()

    print("Введите данные по осадкам: ")
    val precipitation = MessagePrecipitation(readln().toInt())
    precipitation.sendMessage()
}