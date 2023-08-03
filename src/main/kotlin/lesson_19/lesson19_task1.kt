package lesson_19

const val INDEX_CORRECTION = 1

enum class Fish(val fishRus: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок");
}

fun main() {
    println("Вы можете добавить в акваруим:")

    for (fish in Fish.values()) println("${fish.ordinal + INDEX_CORRECTION} - ${fish.fishRus}")
}