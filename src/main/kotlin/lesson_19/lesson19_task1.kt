package lesson_19

const val INDEX_CORRECTION = 1

enum class Fish {
    GUPPY {
        override fun getNameInRus(): String {
            return "Гуппи"
        }
    },
    ANGELFISH {
        override fun getNameInRus(): String {
            return "Скалярия"
        }
    },
    GOLDFISH {
        override fun getNameInRus(): String {
            return "Золотая рыбка"
        }
    },
    SIAMESE_FIGHTING_FISH {
        override fun getNameInRus(): String {
            return "Петушок"
        }
    };

    abstract fun getNameInRus(): String
}


fun main() {
    println("Вы можете добавить в акваруим:")

    for (fish in Fish.values()) println("${fish.ordinal + INDEX_CORRECTION} - ${fish.getNameInRus()}")
}