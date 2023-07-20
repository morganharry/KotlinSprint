package lesson_11

class Contact(
    var avatar: String = "",
    var firstName: String,
    var secondName: String= "",
    var mobilePhoneNum: String= "",
    var homePhoneNum: String= "",
    var iCloud: String= "",
    var closePeople1:Contact = Contact(firstName=""),
    var closePeople2:Contact = Contact(firstName=""),
    var closePeople3:Contact = Contact(firstName=""),
) {
    fun write() {
    }

    fun callAudio() {
    }

    fun callVideo() {
    }

    fun sendMail() {
    }
    fun callAudioByFaceTime() {
    }

    fun callVideoByFaceTime() {
    }

}