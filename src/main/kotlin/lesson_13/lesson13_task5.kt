package lesson_13

fun main() {
    val number: Long

    try {
        print("Введите номер: ")
        val strNumber = readln()
        number = strNumber.toLong()
        println("Вы ввели номер: $number")
    }
    catch (e: NumberFormatException) {
        println("В вводе отсуствует число!")
    }

}