package lesson_15

interface MovementOutOfWater {
    fun swimOnWater() {
        println("Плывет по воде.")
    }

    fun fly() {
        println("Летит.")
    }

    fun sit() {
        println("Сидит.")
    }

    fun run() {
        println("Бежит.")
    }
}

interface MovementInWater {
    fun swimUnderWater() {
        println("Плывет под водой.")
    }

    fun dive() {
        println("Ныряет.")
    }
}

abstract class Organism {
    abstract val name: String
}

class Duck(override val name: String) : Organism(), MovementOutOfWater, MovementInWater {
}

class Gull(override val name: String) : Organism(), MovementOutOfWater {
}

class Carp(override val name: String) : Organism(), MovementInWater {
}

fun main() {
    val duck1 = Duck("Утка")
    val gull1 = Gull("Чайка")
    val carp1 = Carp("Карась")

    println(duck1.name)
    duck1.swimOnWater()
    duck1.fly()
    duck1.sit()
    duck1.run()
    duck1.swimUnderWater()
    duck1.dive()
    println()

    println(gull1.name)
    gull1.swimOnWater()
    gull1.fly()
    gull1.sit()
    gull1.run()
    println()

    println(carp1.name)
    carp1.swimUnderWater()
    carp1.dive()
}

/*
все супер, только у тебя во многих местах проблемы с форматированием. попробуй сделать автоформатирование) */

/*
Задача 1 к Уроку 15

В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.

 – создай интерфейсы с методами передвижения для следующих существ: карась, чайка, утка;
 – затем создай для каждого существа классы, реализующие соответствующие интерфейсы;
 – выведи сообщения в консоль, о том как они могут передвигаться. */