package lesson_11

fun main() {
    var contact1 = Contact(
        "myavatar.jpg",
        "First name",
        "Second name",
        "8 (999) 999-42-42",
        "8 (999) 888-42-42",
        "mail@mail.ru",
        Contact(firstName = "жена", secondName = "username"),
        Contact(firstName = "подруга", secondName = "username"),
        Contact(firstName = "подруга", secondName = "username"),
    )
}