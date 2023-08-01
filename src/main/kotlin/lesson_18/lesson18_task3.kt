package lesson_18

open class Pet(var name: String) {
    open fun eat() {}
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
