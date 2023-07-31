package lesson_17

class Quiz(
    _question: String = "Что было создано благодаря грибам-плесени?",
    _answer: String = "Пенициллин",
) {
    val question: String = _question
        get() = field
    var answer: String = _answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val quiz1 = Quiz()
    println(quiz1.question)

    val answer = readln()

    if (answer.equals(quiz1.answer, true)) println("Это правильный ответ!")
    else println("Увы, но правильный ответ: ${quiz1.answer}")
    quiz1.answer = answer
}