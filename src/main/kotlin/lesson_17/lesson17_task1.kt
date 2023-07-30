package lesson_17

class Quiz {
    val question: String = "Что было создано благодаря грибам-плесени?"
        get() = field
    var answer: String = "Пенициллин"
        get() = field
        set(value) {
            if (field == value) isTrue = true
        }
    var isTrue = false
}

fun main() {
    val quiz1 = Quiz()
    println(quiz1.question)
    quiz1.answer = readln()
    println("Ваш ответ: ${quiz1.isTrue}")
    println("Правильный ответ: ${quiz1.answer}")
}