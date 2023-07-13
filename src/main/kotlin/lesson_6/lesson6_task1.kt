package lesson_6

fun main() {
    val users = mutableMapOf<String, String>()

    do {
        print("Введите логин для регистрации: ")
        val userNewLogin = readln()
        if (userNewLogin !in users) {
            print("Введите пароль для регистрации: ")
            val userNewPassword = readln()
            users[userNewLogin] = userNewPassword
            break
        } else println("Такой пользователь уже существует.")
    } while (true)

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

    println("Авторизация прошла успешно.")
}