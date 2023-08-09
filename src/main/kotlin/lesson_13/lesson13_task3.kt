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
* */