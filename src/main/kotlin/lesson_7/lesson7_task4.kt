package lesson_7

fun main() {
    print("Введите количество секунд: ")
    val userSec = readln().toInt()

    for (sec in userSec downTo 1) {
        println("Осталось секунд: $sec")
        Thread.sleep(1000)
    }
    println("Время вышло")
}