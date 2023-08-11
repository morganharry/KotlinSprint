package lesson_19

const val NUM_OF_PEOPLE = 5

enum class Gender(val text: String) {
    MALE("мужской"),
    FEMALE("женский"),
}

class Person(val name: String, val gender: Gender)

fun main() {
    println(
        "Далее вам будет предложено форма для ввода данных о человеке.\n" +
                "Вам будет необходимо последовательно ввести сначала ФИО человека (в формате: Фамлиия Имя Отчество).\n" +
                "А затем указать его пол (мужской или женский).\n"
    )
    val listOfPeople = mutableListOf<Person>()
    repeat(NUM_OF_PEOPLE) {
        print("Введите Фамилию Имя Отчество: ")
        val name = readln()
        var gender = Gender.MALE

        do {
            print("Укажите пол (${Gender.MALE.text}/${Gender.FEMALE.text}): ")
            val userInput = readln()
            when {
                userInput.equals(Gender.MALE.text, true) -> {
                    break
                }

                userInput.equals(Gender.FEMALE.text, true) -> {
                    gender = Gender.FEMALE
                    break
                }

                else -> println("Ввод не распознан, попробуйте еще раз.")
            }
        } while (true)

        val person = Person(name, gender)
        listOfPeople.add(person)
    }
    listOfPeople.forEach { println("${it.name} (пол:${it.gender.text})") }
}

/*
Задача 5* к Уроку 19

Разрабатываем приложение “Картотека”. Пользователь вводит имя и пол человека. Данные картотеки хранятся в списке.

Человека описывает класс, содержащий имя и пол. Пол должен храниться в enum. После ввода 5 человек, список выводится в консоль.

При старте приложения печатается инструкция в каком формате вводить имя и пол (и какие значения полов доступны). */