package lesson_5

fun main() {
    val listWin = mutableListOf<Int>()
    while (listWin.size != 2) {
        val num = (1..100).random()
        if (!listWin.contains(num)) listWin.add(num)
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
