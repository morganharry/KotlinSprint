package lesson_20

class Robot(val name: String, var mode: (String) -> Unit) {
    fun say() {
        val listOfPhrase = listOf<String>(
            "Привет, меня зовут ${name}! И я не робот-пылесос.",
            "Вы - великолепные слушатели!",
            "Я верю, что когда-нибудь наступит время и в интернете надо будет доказывать, что ты - не человек!",
            "Почему в трансформерах нет женщин-роботов?...Они долго собираются.",
            "Однажды я пробовался на роль в фильме Терминатор."
        )
        mode((listOfPhrase).random())
    }

    fun setModifier(lambda: (String) -> Unit) {
        mode = lambda
    }
}

fun main() {
    val normalText = { it: String -> println(it) }
    val robot = Robot("R2-D2", normalText)

    robot.say()

    val revers = { it: String -> for (i in it.length - 1 downTo 0) print(it[i]) }
    robot.setModifier(revers)

    robot.say()
}
