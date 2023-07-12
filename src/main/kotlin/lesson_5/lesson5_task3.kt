package lesson_5

import java.util.*

fun main() {
    val listWin = mutableListOf<Int>()
    while (listWin.size != 2) {
        val num = (1..100).random()
        if (!listWin.contains(num)) listWin.add(num)
    }

    val scanner = Scanner(System.`in`)
    print("Введите два числа от 1 до 100 через пробел: ")
    val userNum1 = scanner.nextInt()
    val userNum2 = scanner.nextInt()

    when {
        listWin.contains(userNum1) && listWin.contains(userNum2) -> println("Поздравляем! Вы выиграли главный приз!")
        listWin.contains(userNum1) || listWin.contains(userNum2) -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача! Крутите барабан!")
    }

    println("Выигрышные числа: ${listWin.joinToString()}")
}
