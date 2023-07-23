package lesson_13

class PhoneContact (var name: String, var phoneNum: Long, var company: String?) {
    fun contactView() {
        println("Имя: $name Номер: $phoneNum Компания: ${company ?: "не указано"}")
    }
}

fun main() {
    val contact1 = PhoneContact("Vasiliy", 89999999999, "AirLines")
    val contact2 = PhoneContact("Igor", 89999999998, null)
    println("Контакты:")
    contact1.contactView()
    contact2.contactView()
}