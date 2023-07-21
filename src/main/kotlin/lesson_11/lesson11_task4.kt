package lesson_11

class ContactСlosePeople(
    var nameField: String ="",
    var username: String ="username",
    ) {
}

class Contact(
    var avatar: String = "",
    var firstName: String= "",
    var secondName: String = "",
    var mobilePhoneNum: String = "",
    var homePhoneNum: String = "",
    var iCloud: String = "",
    var closePeople: ArrayList<ContactСlosePeople> = ArrayList <ContactСlosePeople> (),
) {
    fun write() {}
    fun callAudio() {}
    fun callVideo() {}
    fun sendMail() {}
    fun callAudioByFaceTime() {}
    fun callVideoByFaceTime() {}

/*    fun isEmailValid(): Boolean {
    }

    fun isPhonelValid(): Boolean {
    }*/

    fun contactView() {
        println("\t${avatar}\n" +
                "\t${firstName} ${secondName}\n" +
                "сотовый: ${mobilePhoneNum}\n" +
                "домашний: ${homePhoneNum}\n" +
                "iCloud: ${iCloud}")
        println(closePeopleView())
    }
    fun closePeopleView() :String = (closePeople.joinToString(","))
}

fun main() {
    var contact1 = Contact(
        "myavatar.jpg",
        "First name",
        "Second name",
        "8 (999) 999-42-42",
        "8 (999) 888-42-42",
        "mail@mail.ru",
        arrayListOf (ContactСlosePeople("жена"),ContactСlosePeople("подруга"),ContactСlosePeople("подруга"))
    )
    contact1.contactView()
}