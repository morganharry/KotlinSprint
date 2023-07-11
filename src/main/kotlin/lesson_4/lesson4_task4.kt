package lesson_4

fun main() {
    val counterDays = 5
    val typeOfTrain = (counterDays % 2 == 0)

    println(
        "Упражнения для рук: ${!typeOfTrain}\nУпражнения для ног: $typeOfTrain\n" +
                "Упражнения для спины: $typeOfTrain\nУпражнения для пресса: ${!typeOfTrain}"
    )
}