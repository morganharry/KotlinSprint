package lesson_4

const val TABLES: Int = 13

fun main() {
    val todBookedTable = 13
    val tomBookedTable = 9

    println("Доступность столиков на сегодня: ${(todBookedTable) < TABLES},\nДоступность столиков на завтра: ${tomBookedTable < TABLES}")
}
