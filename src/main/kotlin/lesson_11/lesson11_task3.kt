package lesson_11

class Room(
    val cover: String,
    val name: String,
    val usersList: Set <User>,
) {
    fun roomView():String =("\t- обложка: $cover, название: $name, участники: ${usersList.joinToString(",")}")
}

class User (
    val login:String,
    var status:String = "микрофон выключен",
) {

    fun pushOnTheAvatar () {
        println("никнейм пользователя: $login, статус: $status")
        println()
    }
}

fun main() {
    val user1 = User("North1955", "пользователь заглушен")
    val user2 = User("South_1313")
    val user3 = User("WestTT")
    val user4 = User("East777", "разговаривает")

    val room1 = Room("Smile.jpg", "jokes", setOf<User>(user1, user3))
    val room2 = Room("hockey.jpg", "NHL-2023", setOf<User>(user2, user3, user4))
    val room3 = Room("film_reel.jpg", "cinema", setOf<User>(user1, user2, user3, user4))

    val listOfRooms = mutableSetOf<Room>(room1, room2, room3)

    println("Список комнат:")
    for (room in listOfRooms) println(room.roomView())
    println()

    print("Вы нажали на аватар ${user4.login}: ")
    user4.pushOnTheAvatar()
}