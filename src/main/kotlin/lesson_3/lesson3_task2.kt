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