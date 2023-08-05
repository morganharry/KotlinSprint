package lesson_20

class Player(val name: String, var doesHeHaveAKey: Boolean = false)

fun main() {
    val player1 = Player("Larry")
    println("Игрок перед закрытой дверью.")
    val checkKey =
        { it: Player -> if (it.doesHeHaveAKey) println("Дверь открыта!") else println("Дверь заперта!") }
    checkKey(player1)
    println("Игрок волшебный образом находит ключ.")
    player1.doesHeHaveAKey = true
    checkKey(player1)
}
