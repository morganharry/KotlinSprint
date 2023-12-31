package lesson_13

class Contact (var name: String, var phoneNum: Long, var company: String?) {
    fun contactView() {
        println("Имя: $name Телефон: $phoneNum Компания: $company")
    }
}

fun main() {
    val contact1 = Contact("Vasiliy", 89999999999, "AirLines")
    val contact2 = Contact("Igor", 89999999998, null)
    println("Контакты:")
    contact1.contactView()
    contact2.contactView()
}

/*
Задача 1 к Уроку 13

Для программы телефонного справочника создай класс, который будет хранить имя, номер телефона и поле company.
Номер телефона – целочисленное значение. Нужно учесть ситуацию, что поле с компанией может оставаться незаполненным.
Поля не должны иметь никакой инициализации по умолчанию. */