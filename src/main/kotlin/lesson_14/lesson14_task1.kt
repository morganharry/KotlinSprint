package lesson_14

open class Ship(
    val name: String,
    val speed: Int,
    val capacity: Int,
) {
    fun showSpeed() {
        println("Скорость корабля $name: $speed")
    }

    fun showCapacity() {
        println("Груза на корабле $name: $capacity")
    }
}

class Cargo(
    name: String,
    speed: Int,
    capacity: Int,
) : Ship(name, speed, capacity) {
}

class Icebreakers(
    name: String,
    speed: Int,
    capacity: Int,
    var fuelLevel: Int,
) : Ship(name, speed, capacity) {

}

fun main() {
    val ship1 = Ship("Hope", 500, 1000)

    ship1.showSpeed()
    ship1.showCapacity()
}