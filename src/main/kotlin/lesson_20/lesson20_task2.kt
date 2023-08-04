package lesson_20

const val MAX_HEALTH = 100

class Player(val name: String, var health: Int) {

    fun showInfo() {
        println("Игрок $name, здоровье: $health.")
    }
}

fun main() {
    val player1 = Player("Larry", 7)

    println("Мое здоровье на исходе: ${player1.health}... Ух ты, волшебное зелье! Как неожиданно и приятнооо!");

    val heal = { it: Player -> if (it.health < MAX_HEALTH) it.health = MAX_HEALTH }(player1)

    player1.showInfo()
}