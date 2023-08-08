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

/*
а зачем тебе тут лист если у тебя уже есть сет юзеров? можно было бы сделать проще:
fun roomView():String =("\t- обложка: $cover, название: $name, участники: ${usersList.joinToString(",")}")

Owner
Author
@morganharry morganharry 3 weeks ago
Потому что я хочу результат с перечнем login через запятую:
- обложка: Smile.jpg, название: jokes, участники: North1955,WestTT
А в варианте с usersList, т.к. он не String, а User, то выходит:
- обложка: Smile.jpg, название: jokes, участники: lesson_11.User@1ddc4ec2,lesson_11.User@133314b

Понимаю, что неоптимальное решение предложил, но это единственное рабочее, которое пришло мне в голову.

@ievetrov ievetrov 2 weeks ago
чтобы получить логины из объектов юзеров можно сделать таким образом:
${usersList.map{ it.login }.joinToString(",")

мы как бы проходимся по списку и достаем из него логин каждого) */
/*
Задача 3 к Уроку 11

Нужно описать сущности для упрощенной версии приложения социальной сети, в которой общаются только голосом.

Функционал одного из модулей будет такой. Есть лента, в которой отображаются “комнаты” для общения по интересам.
В карточке “комнаты” отображается:
 – обложка
 – название
 – список участников, которые отображаются в виде аватарок. При долгом нажатии на аватар подсветится его никнейм.
  Рядом с аватаркой отображается текстовый бейдж с одним из возможных статусов говорящего: “разговаривает”,
   “микрофон выключен”, “пользователь заглушен”.

После проектирования создай список объектов карточек с несколькими “комнатами” с произвольными данными.
 */
