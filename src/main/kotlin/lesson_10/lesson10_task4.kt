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


/*
интересная реализация, но тут напрашивается enum класс с константами,
в свойствах которых хранится текстовое название. предлагаю допилить красивый вывод)*/

/*
Задача 4 к Уроку 10

Усовершенствуй игру, где пользователь и компьютер по очереди бросают кости.
Побеждает выбросивший наибольшее число. Теперь дай возможность пользователю играть до тех пор пока ему не надоест.
В конце программа должна вывести сколько партий он выиграл.

 – логика бросков должна быть реализована по примеру из задачи 1;
 – после первого раунда программа задает вопрос: “Хотите бросить кости еще раз Введите Да или Нет”;
 – программа в зависимости от ответа запускает новый раунд или заканчивает игру с выводом количества выйгрышных партий человека;
 – в программе должно быть минимум 2 метода (для проведения раунда и для генерации значений брошенных кубиков);
– основная логика программы должна находиться в main(), а 2 другие функции будут вспомогательными. */