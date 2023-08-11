package lesson_19

enum class Ammo(val damage: Int, val color: String) {
    BLUE(5, "Синий"),
    GREEN(10, "Зелёный"),
    RED(20, "Красный"),
}

class Tank(val id: Int, var ammo: Ammo, var isLoaded: Boolean = false) {
    fun changeAmmo() {
        do {
            println("Доступные варианты патронов:")
            for (ammo in Ammo.values()) println("- \"${ammo.color}\" (урон: ${ammo.damage})")
            print("Введите выбранный тип: ")
            val userChoose = readln()
            isLoaded = true
            when {
                userChoose.equals(Ammo.BLUE.color, true) -> ammo = Ammo.BLUE
                userChoose.equals(Ammo.GREEN.color, true) -> ammo = Ammo.GREEN
                userChoose.equals(Ammo.RED.color, true) -> ammo = Ammo.RED
                else -> {
                    println("Указан некорректный тип.")
                    isLoaded = false
                }
            }

            println("Заряжен патрон типа: \"${ammo.color}\" (урон: ${ammo.damage}).")
            print("Хотите поменять тип патрона? (да/нет): ")
        } while (readln().equals("да", true))
    }

    fun fire() {
        if (isLoaded == false) println("Нет патрона!")
        else {
            println("Произведен выстрел патроном типа \"${ammo.color}\".")
            println("Урон: ${ammo.damage}!")
            isLoaded = false
        }
    }
}

fun main() {
    val tank1 = Tank(42, Ammo.BLUE)

    tank1.fire()
    tank1.changeAmmo()
    tank1.fire()
    tank1.fire()
}
/*
все ок, только давай дадим пользователю вводить строки в любом регистре)

нужно исправить этот when, так как сейчас любой ввод цвета (даже без учета регистра) выдает Указан некорректный тип.
при этом дальше по коду выдается сообщение что заряжен патрон синего цвета)

возможно в enum стоит добавить поле не заряжен, либо флаг к танку, тогда после выстрела это поле бы сбрасывалось
*/
/*
Задача 4 к Уроку 19

В компьютерной игре танк может подбирать разные виды патронов. Патроны различаются силой удара. Синие – 5 единиц, зеленые – 10, красные – 20.

 – создай enum класс для патронов и класс танка. У танка должны быть методы вооружения новым типом патронов и выстрела.
  При выстреле в консоль должен выводиться нанесенный урон;
 – создай экземпляр танка и “произведи” несколько выстрелов разными патронами;
 – в решении должен использоваться enum.*/