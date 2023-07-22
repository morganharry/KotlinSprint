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
fun main() {
    val user1 = User(42, "Silvestr", "Hf55hjdjdj", "silvestr@gmail.com")
    val user2 = User(1443, "Vasiliy", "ghg7hD7hjk", "vas1986@gmail.com")

    user1.userPrint()
    user2.userPrint()
}



