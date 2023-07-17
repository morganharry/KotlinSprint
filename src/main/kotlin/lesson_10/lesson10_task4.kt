package lesson_10

const val CORRECTION = 2

fun play(): Int {
    var userNumWin = 0
    do {
        println("Ход Игрока!")
        val userNum = diceRoll()
        println()

        println("Ход Компьютера!")
        val compNum = diceRoll()
        println()

        when {
            userNum > compNum -> {
                println("Победило человечество")
                userNumWin++
            }

            userNum < compNum -> println("Победила машина")

            else -> println("Ничья")
        }

        print("Хотите бросить кости еще раз Введите Да или Нет ")
        if (readln().uppercase() == ("Нет").uppercase()) break
    } while (true)
    return userNumWin
}

fun diceRoll(): Int {
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
        "Двенадцать!"
    )
    println(listOfNum[sum - CORRECTION])
    return (sum)
}

fun main() {
    val userNumWin = play()

    println("Количество выйгрышных партий человека: $userNumWin")
}