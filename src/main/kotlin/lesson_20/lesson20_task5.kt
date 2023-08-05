package lesson_20

class Robot(val name: String, var mode: (String) -> String) {
    fun say() {
        val listOfPhrase = listOf(
            "Привет, меня зовут ${name}! И я не робот-пылесос.",
            "Вы - великолепные слушатели!",
            "Я верю, что когда-нибудь наступит время и в интернете надо будет доказывать, что ты - не человек!",
            "Почему в трансформерах нет женщин-роботов?...Они долго собираются.",
            "Однажды я пробовался на роль в фильме Терминатор."
        )
        println(mode((listOfPhrase).random()))
    }

    fun setModifier(lambda: (String) -> String) {
        mode = lambda
    }
}

fun main() {
    val normalText = { it: String -> it }
    val robot = Robot("R2-D2", normalText)

    robot.say()

    val revers = { it: String -> it.reversed() }
    robot.setModifier(revers)

    robot.say()
}
