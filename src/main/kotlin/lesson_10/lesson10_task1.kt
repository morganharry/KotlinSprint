package lesson_10

fun move(): Int {
    val num = (1..6).random()
    println("Результат: $num")
    return num
}

fun main() {
    println("Ход Игрока!")
    val userNum = move()
    println()

    println("Ход Компьютера!")
    val compNum = move()
    println()

    when {
        userNum > compNum -> println("Победило человечество")
        userNum < compNum -> println("Победила машина")
        else -> println("Ничья")
    }
}