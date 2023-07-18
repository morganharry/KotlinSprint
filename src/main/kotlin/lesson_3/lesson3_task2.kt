package lesson_3

fun main() {
    var lastNameUser = "Андреева"
    val firstNameUser = "Татьяна"
    val patronymicUser = "Сергеевна"
    var ageOfUser = 22

    println("$lastNameUser $firstNameUser $patronymicUser, $ageOfUser")
    lastNameUser = "Сидорова"
    ageOfUser = 25
    println("$lastNameUser $firstNameUser $patronymicUser, $ageOfUser")
}
/*
Задача 2 к Уроку 3

Девушка по имени Андреева Татьяна Сергеевна в 22 года вышла замуж за Сидорова, и поменяла фамилию.
О ней есть запись в одном из государственных приложений. Приложение отслеживает изменения персональных данных граждан.

Выведи в консоль данные на момент когда ей было 20 и на момент когда ей было 22 в формате [ФИО, возраст].
 Все части ФИО и возраст изначально хранятся в отдельных переменных.
 */