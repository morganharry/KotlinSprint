package lesson_11

class Rooms(
    val cover: String,
    val name: String,
    val usersList: MutableSet<Users>,
) {
    fun roomView():String {
        val loginsList = mutableListOf<String>()
        usersList.forEach() {
            loginsList.add(it.login)
        }
        return ("\t- обложка: $cover, название: $name, участники: ${loginsList.joinToString(",")}")
    }
}