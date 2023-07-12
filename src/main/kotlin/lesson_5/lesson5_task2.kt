package lesson_5

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

const val AGE_OF_MAJORITY = 18

fun main() {
    val dateYear = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy")).toInt()
    print("Введите свой год рождения: ")
    val userYear = readln().toInt()

    if ((dateYear - userYear) >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Вернуться на главный экран")
}