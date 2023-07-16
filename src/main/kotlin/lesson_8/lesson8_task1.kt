package lesson_8

fun main() {
    var views = intArrayOf()

    views += 56
    views += 37
    views += 47
    views += 45
    views += 78
    views += 65
    views += 89
    views += 95

    println("Всего просмотров за неделю: ${views.sum()}")
}