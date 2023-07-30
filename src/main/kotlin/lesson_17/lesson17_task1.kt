package lesson_17

class Quiz {
    val question: String = "Что было создано благодаря грибам-плесени?"
        get() = field
    var answer: String = "Пенициллин"
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val quiz1 = Quiz()
}