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