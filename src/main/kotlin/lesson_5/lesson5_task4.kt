package lesson_5

fun main() {
    val users = mutableMapOf(
        "Zaphod" to "PanGalactic",
    )
    val textHello =
        ("Внимание, пассажир.\nМоя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля " +
                "\"Heart of Gold\".\n[вздыхает...]\nЧто ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.\n" +
                "Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь.\n[вздыхает ещё глубже...]\n" +
                "Да, вперед, пожалуйста, вводите свои данные...")

    println(textHello)
    print("Login: ")
    val userLogin = readln()

    val textSuccess = ("[вздыхает...]\nВаши данные проверены, и о, чудо, они верны...\n" +
            "Пользователь \"$userLogin\", вам разрешено входить на борт корабля \"Heart of Gold\".\n" +
            "Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов..." +
            "\n[меланхолический вздох...]\nНадеюсь, вам понравится пребывание здесь больше, чем мне.")
    val textFail = ("[вздыхает...]\n Увы...Может вы хотите зарегистрироваться?")

    if (userLogin in users) {
        print("Password: ")
        val userPassword = readln()
        if (users.get(userLogin) == userPassword) println(textSuccess)
        else println(textFail)
    } else println(textFail)
}