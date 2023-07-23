package lesson_11

class ContactСlosePeople(
    var nameField: String = "",
    var username: String = "username",
) {
}

class Contact(
    var avatar: String = "",
    var firstName: String = "",
    var secondName: String = "",
    var mobilePhoneNum: String = "",
    var homePhoneNum: String = "",
    var iCloud: String = "",
    var closePeople: ArrayList<ContactСlosePeople> = ArrayList<ContactСlosePeople>(),
) {
    fun write() {}
    fun callAudio() {}
    fun callVideo() {}
    fun sendMail() {}
    fun callAudioByFaceTime() {}
    fun callVideoByFaceTime() {}

    fun addEmail() {
        var mail = ""

        do {
            print("Введите электронную почту: ")
            mail = readln()
            if (Regex("""^[^@\s]+@[^@\s]+\.[^@\s]+${'$'}""").matches(mail)) break
            else println("почта не соотвуствует формату e-mail.")
        } while (true)

        iCloud = mail

        println("Вы ввели  адрес почты: $iCloud")
    }

    fun addMobilePhoneNum() {
        var num = ""

        do {
            print("Введите номер сотового телефона: ")
            num = Regex("[^0-9]").replace(readln(), "")
            if (num.length != 11) println("Количество цифр в номере должно быть 11!")
        } while (num.length != 11)

        mobilePhoneNum = String.format(
            "%1s (%3s)-%2s-%2s-%2s",
            num[0],
            num.substring(1, 4),
            num.substring(4, 7),
            num.substring(7, 9),
            num.substring(9, 11)
        )

        println("Вы ввели номер: $mobilePhoneNum")
    }

    fun contactView() {
        println(
            "\t${avatar}\n" +
                    "\t${firstName} ${secondName}\n" +
                    "сотовый: ${mobilePhoneNum}\n" +
                    "домашний: ${homePhoneNum}\n" +
                    "iCloud: ${iCloud}"
        )
        println(closePeopleView())
    }

    fun closePeopleView(): String = (closePeople.joinToString(","))
}

fun main() {
    var contact1 = Contact(
        "myavatar.jpg",
        "First name",
        "Second name",
        "8 (999) 999-42-42",
        "8 (999) 888-42-42",
        "mail@mail.ru",
        arrayListOf(ContactСlosePeople("жена"), ContactСlosePeople("подруга"), ContactСlosePeople("подруга"))
    )

    contact1.contactView()
    println()
    contact1.addMobilePhoneNum()
    println()
    contact1.contactView()
    println()
    contact1.addEmail()
    println()
    contact1.contactView()
}

