package lesson_20

const val MAX_HEALTH = 100

class PlayerInfo(val name: String, var health: Int) {

    fun showInfo() {
        println("Игрок $name, здоровье: $health.")
    }
}

fun main() {
    val player1 = PlayerInfo("Larry", 7)

    println("Мое здоровье на исходе: ${player1.health}... Ух ты, волшебное зелье! Как неожиданно и приятнооо!");

    val heal = { it: PlayerInfo -> if (it.health < MAX_HEALTH) it.health = MAX_HEALTH }(player1)

    player1.showInfo()
}

/*
* */

/*
Задача 2 к Уроку 20

В компьютерной игре игрок может подобрать лечебное зелье, которое восстанавливает всё его здоровье. Создай класс игрока
(у него должно быть имя, текущее и максимальное здоровье).
 Затем напиши лямбда-функцию, реализующую лечебное зелье. Создай экземпляр игрока с неполным здоровьем, примени к нему созданную лямбду-функцию.*/