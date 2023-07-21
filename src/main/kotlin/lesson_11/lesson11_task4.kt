package lesson_11

class Contact(
    var avatar: String = "",
    var firstName: String= "",
    var secondName: String = "",
    var mobilePhoneNum: String = "",
    var homePhoneNum: String = "",
    var iCloud: String = "",
    var closePeople1: String = "username",
    var closePeople2: String = "username",
    var closePeople3: String = "username",
) {
    fun write() {}
    fun callAudio() {}
    fun callVideo() {}
    fun sendMail() {}
    fun callAudioByFaceTime() {}
    fun callVideoByFaceTime() {}

    fun contactView() {
        println("\t${avatar}\n" +
                "\t${firstName} ${secondName}\n" +
                "сотовый: ${mobilePhoneNum}\n" +
                "домашний: ${homePhoneNum}\n" +
                "iCloud: ${iCloud}\n" +
                "жена ${closePeople1}\n" +
                "подруга ${closePeople2}\n" +
                "подруга ${closePeople3}")
    }
}

fun main() {
    var contact1 = Contact(
        "myavatar.jpg",
        "First name",
        "Second name",
        "8 (999) 999-42-42",
        "8 (999) 888-42-42",
        "mail@mail.ru",
    )

    contact1.contactView()
}