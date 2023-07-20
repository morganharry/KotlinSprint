package lesson_11

class Users (
    val login:String,
    var status:String = "микрофон выключен",
) {

    fun pushOnTheAvatar () {
        println("никнейм пользователя: $login, статус: $status")
        println()
    }
}