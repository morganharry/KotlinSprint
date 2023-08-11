package lesson_18

abstract class Pet(var name: String) {
    abstract fun eat()
    fun play() {
        println("$name - играет.")
    }

    fun sleep() {
        println("$name - спит.")
    }
}

class Fox(name: String) : Pet(name) {
    override fun eat() {
        println("$name - ест ягоды.")
    }
}

class Dog(name: String) : Pet(name) {
    override fun eat() {
        println("$name - ест кости.")
    }
}


class Cat(name: String) : Pet(name) {
    override fun eat() {
        println("$name - ест рыбу.")
    }
}

fun main() {
    val pet1: Pet = Fox("Рыжик")
    val pet2: Pet = Dog("Денни")
    val pet3: Pet = Cat("Барсик")

    val listOfPets = listOf<Pet>(pet1, pet2, pet3)

    listOfPets.forEach {
        it.eat()
        it.play()
        it.sleep()
        println()
    }
}

/*
верно, этот метод надо переопределить. но я бы сделал все же его абстрактным */
/*
Задача 3 к Уроку 18

В тамагочи есть лиса, собака и кошка. Они могут играть, спать и есть. Лиса ест ягоды, собака – кости, а кошка – рыбу.
 У каждого животного есть имя. Эти действия отображаются в консоли по такому шаблону: “[имя] - [действие]”.

Напиши эти классы, используя полиморфизм и создай по одному экземпляру.*/
