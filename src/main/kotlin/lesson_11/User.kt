package lesson_11

class User(
    val id: Int,
    val login: String,
    val psw: String,
    val mail: String,
) {
    fun userPrint() {
        println("id: ${String.format("%06d", id)}, login: ${login}, password: ${psw}, mail: ${mail}")
    }
}