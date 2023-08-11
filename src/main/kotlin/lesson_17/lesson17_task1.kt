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

/*
в задании сказано свойства должны быть в конструкторе)

эта переменная выглядит здесь лишней, можно проверять правильный ли ответ в main функции*/

/*
Задача 1 к Уроку 17

Создай класс, описывающий элемент викторины. В конструкторе два текстовых свойства: вопрос и ответ.
Явно пропиши для вопроса сеттер, для ответа сеттер и геттер.*/