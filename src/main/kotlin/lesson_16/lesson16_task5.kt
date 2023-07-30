package lesson_16

class Dice(
    val name: String,
    private val num: Int = (1..6).random(),
) {
    fun showResult() {
        println("Результат: $num.")
    }
}

fun main() {
    val dice = Dice("dice1")
    dice.showResult()
}