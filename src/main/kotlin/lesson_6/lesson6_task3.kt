package lesson_6

fun main() {
    print("Введите число, чтобы установить таймер в сек: ")
    val timerSec = readln().toInt()
    var counter = 0

    while (true) {
        Thread.sleep(1000)
        counter++
        if (counter == timerSec) break
        println("Осталось секунд: ${timerSec - counter}")
    }
    println("Время вышло")
}