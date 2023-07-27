package lesson_14

open class Ship(
    val name: String,
    val speed: Int,
    val capacity: Int,
    val doesItBreakIce: Boolean,
) {
    fun showSpeed() {
        println("Скорость корабля $name: $speed")
    }

    fun showCapacity() {
        println("Груза на корабле $name: $capacity")
    }

    fun showDoesItBreakIce() {
        println("Возможность $name колоть лёд: $doesItBreakIce")
    }
}

fun main() {
    val ship1 = Ship("Hope", 500, 1000, false)

    ship1.showSpeed()
    ship1.showCapacity()
    ship1.showDoesItBreakIce()
}