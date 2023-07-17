package lesson_10

fun game(): Int {
    var userNumWin = 0
    do {
        println("Ход Игрока!")
        val userNum = move()
        println()

        println("Ход Компьютера!")
        val compNum = move()
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
        if (readln() == "Нет") break
    } while (true)
    return userNumWin
}

fun move(): Int {
    val num = (1..6).random()
    println("Результат: $num")
    return num
}

fun main() {
    val userNumWin = game()

    println("Количество выйгрышных партий человека: $userNumWin")
}