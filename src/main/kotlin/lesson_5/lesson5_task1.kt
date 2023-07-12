package lesson_5

fun main() {
    val num1 = (0..9).random()
    val num2 = (0..9).random()
    val sum = num1 + num2

    print(
        "Для того чтобы убедиться, что вы не робот, напишите, пожалуйста, ответ на простой пример.\n" +
                "$num1 + $num2: "
    )
    val userSum = readln().toInt()

    if (userSum == sum) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}