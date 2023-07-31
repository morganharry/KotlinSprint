package lesson_17

class Quiz(
    _question: String = "Что было создано благодаря грибам-плесени?",
    _answer: String = "Пенициллин",
    var isTrue: Boolean = false
) {
    val question: String = _question
        get() = field
    var answer: String = _answer
        get() = field
        set(value) {
            if (value.equals(field, true)) isTrue = true
        }
}

fun main() {
    val quiz1 = Quiz()
    println(quiz1.question)
    quiz1.answer = readln()
    println("Ваш ответ: ${quiz1.isTrue}")
    println("Правильный ответ: ${quiz1.answer}")
}