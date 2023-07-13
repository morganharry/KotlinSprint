package lesson_6

const val NUM = 5

fun main() {
    val secretNum = (1..9).random()
    var counter = 0

    while (++counter <= NUM) {
        print("Введите число от 1 до 9: ")
        val userNum = readln().toInt()
        if (userNum == secretNum) {
            println("Это была великолепная игра!")
            break
        } else println("Неверно")
    }
    println("Было загадано число $secretNum")
}
