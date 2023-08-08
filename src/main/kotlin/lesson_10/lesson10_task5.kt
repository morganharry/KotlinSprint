package lesson_10

const val LENGTH_MIN = 4

fun createLogin(): String {
    var userLogin = ""

    do {
        print("Придумайте и введите логин: ")
        userLogin = readln()
    } while (checkLoginLength(userLogin))
    println("Ваш логин: $userLogin")
    return userLogin
}

fun checkLoginLength(str: String) = if (str.length < LENGTH_MIN) {
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

/*
Задача 5* к Уроку 10

Собери в одно целое регистрацию пользователя, проверку логина (минимум 4 символа),
 генерацию пароля для него и авторизацию по коду из смс – программа должна “высылать” код из четырех цифр (случайное число от 1000 до 9999).
 Пользователь будет вводить этот код. Если код введён неверно, программа вышлет новый.

Алгоритм действий:
1. Регистрация
 – пользователь придумывает логин (длина должна быть более 4 символов);
 – программа генерирует пароль и отображает его пользователю;

2. Авторизация
 – программа предлагает авторизоваться, пользователь вводит логин и пароль;
 – если данные неверны, отображается ошибка и логин и пароль запрашиваются заново;
 – если данные верны, “высылается” сгенерированный код из 4 цифр и запрашивается у пользователя;
 – если код неверен – высылается новый, если верен – появляется сообщение об успешной авторизации.

Действия в программе должны быть распределены по соответствующим методам без дублирования кода. */