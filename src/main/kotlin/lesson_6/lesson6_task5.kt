package lesson_6

const val NUM_OF_TRY = 3

fun main() {
    var counter = 0

    do {
        println("Нам важно убедиться, что вы человек. Для этого решите простой пример:")
        val num1 = (1..9).random()
        val num2 = (1..9).random()
        val sum = num1 + num2
        print("$num1 + $num2 = ")
        val userSum = readln().toInt()
        if (userSum == sum) {
            println("Добро пожаловать!")
            break
        } else {
            counter++
            if (counter == NUM_OF_TRY) {
                println("Доступ запрещен")
                break
            }
            println("Неверно, попробуйте еще раз")
        }
    } while (true)
}