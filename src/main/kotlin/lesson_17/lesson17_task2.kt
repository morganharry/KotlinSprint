package lesson_17

class SpaceShip(_name: String, var speed: Int = 1200, var port: String = "Pembroke Dock") {
    var name: String = _name
        set(value) {
            println("Вы не можете изменить название корабля.")
        }
}

fun main() {
    val ship1 = SpaceShip("Millennium Falcon", 1200, "Pembroke Dock")
    println(ship1.name)
    println("Попытка переименовать корабль...")
    ship1.name = "Soulless One"
    println(ship1.name)
}