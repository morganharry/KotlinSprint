package lesson_11

class Rooms(
    val cover: String,
    val name: String,
    val usersList: MutableSet<UsersCl>,
) {
    fun roomView():String {
        val loginsList = mutableListOf<String>()
        usersList.forEach() {
            loginsList.add(it.login)
        }
        return ("\t- обложка: $cover, название: $name, участники: ${loginsList.joinToString(",")}")
    }
}

class UsersCl (
    val login:String,
    var status:String = "микрофон выключен",
) {

    fun pushOnTheAvatar () {
        println("никнейм пользователя: $login, статус: $status")
        println()
    }
}

fun main() {
    val user1 = UsersCl("North1955", "пользователь заглушен")
    val user2 = UsersCl("South_1313")
    val user3 = UsersCl("WestTT")
    val user4 = UsersCl("East777", "разговаривает")

    val room1 = Rooms("Smile.jpg", "jokes", mutableSetOf<UsersCl>(user1, user3))
    val room2 = Rooms("hockey.jpg", "NHL-2023", mutableSetOf<UsersCl>(user2, user3, user4))
    val room3 = Rooms("film_reel.jpg", "cinema", mutableSetOf<UsersCl>(user1, user2, user3, user4))

    val listOfRooms = mutableSetOf<Rooms>(room1, room2, room3)

    println("Список комнат:")
    for (room in listOfRooms) println(room.roomView())
    println()

    print("Вы нажали на аватар ${user4.login}: ")
    user4.pushOnTheAvatar()
}