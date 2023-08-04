package lesson_11

class RoomOfUser(
    val cover: String,
    val name: String,
    val usersList: List<RoomsUser>,
) {
    fun roomView(): String =
        ("\t- обложка: $cover, название: $name, участники: ${usersList.joinToString(", ") { it.login }}")
}

class RoomsUser(
    val login: String,
    var status: String = "микрофон выключен",
) {

    fun pushOnTheAvatar() {
        println("никнейм пользователя: $login, статус: $status")
        println()
    }
}

fun main() {
    val user1 = RoomsUser("North1955", "пользователь заглушен")
    val user2 = RoomsUser("South_1313")
    val user3 = RoomsUser("WestTT")
    val user4 = RoomsUser("East777", "разговаривает")

    val room1 = RoomOfUser("Smile.jpg", "jokes", listOf<RoomsUser>(user1, user3))
    val room2 = RoomOfUser("hockey.jpg", "NHL-2023", listOf<RoomsUser>(user2, user3, user4))
    val room3 = RoomOfUser("film_reel.jpg", "cinema", listOf<RoomsUser>(user1, user2, user3, user4))

    val listOfRooms = mutableSetOf<RoomOfUser>(room1, room2, room3)

    println("Список комнат:")
    for (room in listOfRooms) println(room.roomView())
    println()

    print("Вы нажали на аватар ${user4.login}: ")
    user4.pushOnTheAvatar()
}
