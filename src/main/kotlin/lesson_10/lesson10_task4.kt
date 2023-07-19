package lesson_10

enum class Result(val value: Int, val num: String) {
    TWO(2, "Два!"),
    THREE(3, "Три!"),
    FOUR(4, "Четыре!"),
    FIVE(5, "Пять!"),
    SIX(6, "Шесть!"),
    SEVEN(7, "Семь!"),
    EIGHT(8, "Восемь!"),
    NINE(9, "Девять!"),
    TEN(10, "Десять!"),
    ELEVEN(11, "Одинадцать!"),
    TWELVE(12, "Двенадцать!");
}

fun findByValue(value: Int): String {
    for (enum in Result.values()) {
        if (value == enum.value) return enum.num
    }
    return ""
}

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

    println(findByValue(sum))
    return (sum)
}

fun main() {
    val userNumWin = play()

    println("Количество выйгрышных партий человека: $userNumWin")
}