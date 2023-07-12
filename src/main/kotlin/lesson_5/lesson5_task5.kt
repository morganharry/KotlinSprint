package lesson_5

const val NUM_OF_WIN_NUM = 2

fun main() {
    val listWin = mutableListOf<Int>()

    while (true) {
        val num = (1..100).random()
        if (!listWin.contains(num)) listWin.add(num)
        if (listWin.size == NUM_OF_WIN_NUM) break
    }

    print("Введите два числа от 1 до 100 через пробел: ")
    val (userNum1, userNum2) = readln().split(" ").map { it.toInt() }

    when {
        listWin.contains(userNum1) && listWin.contains(userNum2) -> println("Поздравляем! Вы выиграли главный приз!")
        listWin.contains(userNum1) || listWin.contains(userNum2) -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача! Крутите барабан!")
    }

    println("Выигрышные числа: ${listWin.joinToString()}")
}