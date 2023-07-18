package lesson_10

fun generatePsw(num: Int): String {
    var psw = ""
    for (i in 0 until num) {
        val char = if (i % 2 != 0) ('0'..'9').random()
        else (' '..'/').random()
        psw += char
    }
    return psw
}

fun main() {
    print("Введите длину пароля: ")
    val num = readln().toInt()
    val userPsw = generatePsw(num)

    println("Ваш пароль: $userPsw")
}