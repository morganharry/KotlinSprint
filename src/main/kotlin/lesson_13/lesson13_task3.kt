package lesson_13

class ContactPhone (var name: String, var phoneNum: Long?, var company: String?) {
}

fun contactListView(list: MutableList<ContactPhone>) {
    for (contact in list) {
        println("Имя: ${contact.name} Номер: ${contact.phoneNum ?: "[не указано]"} Компания: ${contact.company ?: "[не указано]"}")
    }
}

fun main() {
    val contactList = mutableListOf<ContactPhone>()
    val contact1 = ContactPhone("Vasiliy", 89999999999, "AirLines")
    contactList.add(contact1)
    val contact2 = ContactPhone("Igor", 89999999998, null)
    contactList.add(contact2)
    val contact3 = ContactPhone("Egor", null, null)
    contactList.add(contact3)
    val contact4 = ContactPhone("Mihail", 89999999997, "AirLines")
    contactList.add(contact4)
    val contact5 = ContactPhone("Boris", null, "AirLines")
    contactList.add(contact5)

    contactListView(contactList)
}
/*
все окей, но напоминаю, что функции корректнее называть в инфинитиве. чтобы было явно понятно их предназначение */

/*
Задача 3 к Уроку 13

Скопируй класс из предыдущей задачи с новым уникальным названием. Для того, чтобы взаимодействовать со всеми
 записями телефонной книги, как с одним целым, их нужно объединить в список.

Создай пустой список, добавь в него несколько объектов класса-контакта, инициализируя их с разнообразными данными
(в том числе и null).

Напиши функцию, которая будет выводить имя, номер телефона и компанию. Если какого-либо значения нет –
программа должна заменить его на строку [не указано]. С помощью этой функции выведи в консоль все объекты из списка. */