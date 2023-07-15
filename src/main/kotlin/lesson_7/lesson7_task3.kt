package lesson_7

fun main() {
    println("Введите число: ")
    val num = readln().toInt()

    for (i in 2..num step 2) println(i)
}