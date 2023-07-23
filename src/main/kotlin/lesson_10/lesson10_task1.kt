package lesson_10

const val CORRECTION = 2

fun rollDice(): Int {
    val num1 = (1..6).random()
    val num2 = (1..6).random()
    println("Результат: $num1 и $num2")
    val sum = (num1 + num2)
    val listOfNum = listOf(
        "Два!",
        "Три!",
        "Четыре!",
        "Пять!",
        "Шесть!",
        "Семь!",
        "Восемь!",
        "Девять!",
        "Десять!",
        "Одинадцать!",
        "Двенадцать!",
    )
    println(listOfNum[sum - CORRECTION])
    return (sum)
}

fun main() {
    println("Ход Игрока!")
    val userNum = rollDice()
    println()

    println("Ход Компьютера!")
    val compNum = rollDice()
    println()

    when {
        userNum > compNum -> println("Победило человечество")
        userNum < compNum -> println("Победила машина")
        else -> println("Ничья")
    }
}
