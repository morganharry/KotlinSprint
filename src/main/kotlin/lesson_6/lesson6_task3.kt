package lesson_6

fun main() {
    print("Введите число, чтобы установить таймер в сек: ")
    val timerSec = readln().toInt()
    var counter = 0

    while (counter != timerSec) {
        println("Осталось секунд: ${timerSec - counter}")
        Thread.sleep(1000)
        counter++
    }
    println("Время вышло")
}