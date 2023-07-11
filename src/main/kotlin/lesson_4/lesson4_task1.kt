package lesson_4

const val TABLES: Int = 13

fun main() {
    val todayFreeTable = 0
    val tomorrowFreeTable = 4

    println("Доступность столиков на сегодня: ${(todayFreeTable) > 0},\nДоступность столиков на завтра: ${tomorrowFreeTable > 0}")
}
