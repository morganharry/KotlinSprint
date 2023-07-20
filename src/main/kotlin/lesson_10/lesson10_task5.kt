package lesson_10

const val MIN_LENGTH = 4

fun createLogin(): String {
    var userLogin = ""

    do {
        print("Придумайте и введите логин: ")
        userLogin = readln()
    } while (checkLoginLength(userLogin))
    println("Ваш логин: $userLogin")
    return userLogin
}

fun checkLoginLength(str: String) = if (str.length < MIN_LENGTH) {
    println("Логин недостаточно длинный (менее 4-ех символов)")
    true
} else {
    println("Логин одобрен")
    false
}

fun createPsw(): String {
    var userPsw = ""
    val pswLength = (6..9).random()

    for (i in 0 until pswLength) {
        val char = (('0'..'z')).random()
        userPsw += char
    }
    println("Ваш пароль: $userPsw")
    return userPsw
}

fun logIn(users: MutableMap<String, String>) {
    do {
        print("Введите логин для авторизации: ")
        val userLogin = readln()
        if (userLogin !in users) println("Извините, но такой пользователь не зарегистрирован. Попробуйте еще раз.")
        else {
            do {
                print("Введите пароль для авторизации: ")
                val userPassword = readln()
                if (users[userLogin] != userPassword) println("Извините, но пароль неправильный. Попробуйте еще раз.")
            } while (users[userLogin] != userPassword)
        }
    } while (userLogin !in users)

    do {
        val smsCode = (1000..9999).random()
        println("Ваш код авторизации: $smsCode")
        print("Введите ваш код авторизации: ")

        val userCode = readln().toInt()

        if (userCode != smsCode) println("Неверно.")
    } while (userCode != smsCode)

    println("Добро пожаловать.")
}

fun main() {
    val users = mutableMapOf<String, String>()
    val userNewLogin = createLogin()
    val userNewPsw = createPsw()
    println(userNewLogin)
    println(userNewPsw)

    users[userNewLogin] = userNewPsw
    logIn(users)
}