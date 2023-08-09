package lesson_14

open class ShipStandart(
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

class CargoShip(
    name: String,
    speed: Int,
    capacity: Int,
    var destination: String,
) : ShipStandart(name, speed, capacity) {
    fun keepCourse() {
        println("Корабль $name держит курс на $destination.")
    }
}

class IcebreakersShip(
    name: String,
    speed: Int,
    capacity: Int,
    var fuelLevel: Int,
) : ShipStandart(name, speed, capacity) {
    fun breakeIce() {
        println("Корабль $name приступил колоть лёд.")
    }

    fun showFuelLevel() {
        println("Уровень топлива корабля $name: $fuelLevel")
    }
}

fun main() {
    val ship1 = ShipStandart("Hopeless", 500, 1000)

    ship1.showSpeed()
    ship1.showCapacity()

    val ship2 = CargoShip("Brewery", 300, 7000, "Dublin")

    ship2.showSpeed()
    ship2.showCapacity()
    ship2.keepCourse()

    val ship3 = IcebreakersShip("Bravery", 200, 800, 25)

    ship3.showSpeed()
    ship3.showCapacity()
    ship3.breakeIce()
    ship3.showFuelLevel()
}

/*
Задача 2 к Уроку 14

Преобразуй (скопируй в файл с этой задачей с новым названием) класс из прошлой задачи в родительский и напиши два подкласса,
 представляющие грузовой корабль и ледокол. Создай по одному экземпляру каждого класса и вызови их методы.
 Придумай для каждого подкласса по 1-2 специализированного свойства.

 – добавь метод для ледокола, что он может колоть лед;
 – выведи в консоль информацию с названием кораблей, с какой скоростью движутся,     сколько перевозят грузов,
  и что ледокол колет лед. */