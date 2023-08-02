package lesson_18

open class Dice() {
    open fun viewResult() {
    }
}

class Dice4(var result: String = (1..4).random().toString()) : Dice() {
    override fun viewResult() {
        println("Результат кубика с 4-мя гранями: $result")
    }
}

class Dice6(var result: String = (1..6).random().toString()) : Dice() {
    override fun viewResult() {
        println("Результат кубика с 6-тью гранями: $result")
    }
}

class Dice8(var result: String = (1..6).random().toString()) : Dice() {
    override fun viewResult() {
        println("Результат кубика с 8-мью гранями: $result")
    }
}

fun main() {
    val result1: Dice = Dice4()
    val result2: Dice = Dice6()
    val result3: Dice = Dice8()

    val listOfResult = listOf<Dice>(result1, result2, result3)
    viewRollOfADice(listOfResult)
}

fun viewRollOfADice(listOfResult: List<Dice>) {
    listOfResult.forEach { it.viewResult() }
    println()
}