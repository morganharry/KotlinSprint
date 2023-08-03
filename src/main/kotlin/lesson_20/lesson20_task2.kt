package lesson_20

const val MAX_HEALTH = 100

class Player(val name: String, var health: Int)

fun main() {
    val player1 = Player("Larry", 70)
    println("Иду-иду...бац! Ух ты, волшебное зелье! Как неожиданно и приятнооо!");

    run {
        if (player1.health < MAX_HEALTH) player1.health = MAX_HEALTH
        println("Будь здоров! ${player1.health}")
    }


}