package lesson_13

class ContactByPhone(var name: String?, var phoneNum: Long, var company: String?) {
}

fun showContactList(list: MutableList<ContactByPhone>) {
    println("Контакты:")
    for (contact in list) {
        println("- Имя: ${contact.name} Номер: ${contact.phoneNum} Компания: ${contact.company}")
    }
}

fun addContact(list: MutableList<ContactByPhone>): MutableList<ContactByPhone> {
    do {
        print("Введите имя контакта: ")

        var name: String? = readln()
        if (name.isNullOrEmpty()) name = null
        print("Введите номер телефона контакта: ")

        val phoneNum = readln()
        if (phoneNum.isNullOrEmpty()) println("Поле не может быть пустым")
        else {
            print("Введите название компании контакта: ")

            var company: String? = readln()
            if (company.isNullOrEmpty()) company = null

            list.add(ContactByPhone(name, phoneNum.toLong(), company))
        }
        println()
        println("Если хотите добавить новую запись, введите \"да\"")
        if (!readln().equals("да", true)) break
    } while (true)
    return list
}

fun main() {
    var contactList = mutableListOf<ContactByPhone>()

    contactList = addContact(contactList)
    showContactList(contactList)
}
/*
предлагаю делать проверку на пустоту подходящей для этого функцией isEmptyOrNull()

 Есть еще способ сравнения переменных, причем сразу с параметром игнорирования case
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/equals.html

и тут еще тоже давай поменяем название на инфинитив

не добавлено игнорирование кейза (см параметр ignoreCase: Boolean)
*/




/*
Задача 4 к Уроку 13

Допиши функцию, для программы, которая позволит пользователю добавлять записи в телефонную книгу.
Функция должна валидировать следующие случаи: пользователь ввел имя и номер, пользователь не ввел имя или компанию
(вместо пустой строки должен быть null),
пользователь не ввел номер телефона (такая запись не должна добавляться).

После добавления первой записи, пользователя спрашивают “Если хотите добавить новую запись, введите \“да\””.
 В любом другом случае функция завершает работу. Программа должна добавлять столько записей, сколько пользователю нужно,
  а затем печатать все записи в консоли в компактном виде. */