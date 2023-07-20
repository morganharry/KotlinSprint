package lesson_11

fun main() {
    val user1 = Users("North1955", "пользователь заглушен")
    val user2 = Users("South_1313")
    val user3 = Users("WestTT")
    val user4 = Users("East777", "разговаривает")

    val room1 = Rooms("Smile.jpg", "jokes", mutableSetOf<Users>(user1, user3))
    val room2 = Rooms("hockey.jpg", "NHL-2023", mutableSetOf<Users>(user2, user3, user4))
    val room3 = Rooms("film_reel.jpg", "cinema", mutableSetOf<Users>(user1, user2, user3, user4))

    val listOfRooms = mutableSetOf<Rooms>(room1, room2, room3)

    println("Список комнат:")
    for (room in listOfRooms) println(room.roomView())
    println()

    print("Вы нажали на аватар ${user4.login}: ")
    user4.pushOnTheAvatar()
}