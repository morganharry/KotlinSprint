package lesson_19


class SpaceShip(val name: String) {
    fun takeOff() {
        println("$name взлетает!")
    }

    fun land() {
        println("$name приземляется!")
        TODO("добавить доп.логику")
    }

    fun fire() {
        TODO()
    }
}

fun main() {
    val ship1 = SpaceShip("Сокол")
    ship1.takeOff()
    ship1.land()
    ship1.fire()
}