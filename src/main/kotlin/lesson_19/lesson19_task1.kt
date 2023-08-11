package lesson_19

const val INDEX_CORRECTION = 1

enum class Fish(val fishRus: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}

fun main() {
    println("Вы можете добавить в акваруим:")

    for (fish in Fish.values()) println("${fish.ordinal + INDEX_CORRECTION} - ${fish.fishRus}")
}
/*
все хорошо, но в enum не принято делать абстрактные функции. в этом случае можно упростить код, сделав таким образом:

enum class Fish(val fishName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
} */
/*
Задача 1 к Уроку 19

В симуляторе аквариума есть 4 вида рыб. Гуппи (guppy), скалярия (angelfish), золотая рыбка (Goldfish), петушок (Siamese fighting fish).
Напиши enum класс, перечисляющий этих рыб. Сообщи пользователю, каких рыб он может добавить в свой аквариум, распечатав список в консоль. */