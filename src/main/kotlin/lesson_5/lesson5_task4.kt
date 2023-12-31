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
        if (users[userLogin] == userPassword) println(textSuccess)
        else println(textFail)
    } else println(textFail)
}

/*
сейчас Идея рекомендует обращаться к полю не через функцию, а по индексу. так и предлагаю поступить
 */

/*
Задача 4 к Уроку 5

Космический корабль "Heart of Gold" верифицирует каждого входящего пассажира с помощью логина и пароля.
 встречает параноидальный робот-андройд Марвин.

Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold".
[вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.
Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...]
Да, вперед, пожалуйста, вводите свои данные...

У вас есть зарегистрированный бортовой пользователь с именем "Zaphod" и паролем "PanGalactic".
Этот пользователь имеет доступ к управлению кораблем и может осуществлять навигацию по вселенной.

Бортовой робот-андроид Марвин печально запрашивает имя пользователя для входа в систему.
Система должна проверить, зарегистрирован ли пользователь.
Если нет, то система должна предложить пользователю зарегистрироваться и закончить процесс тут (завершить программу).

Если же пользователь уже зарегистрирован, система должна проверить пароль.
При успешной авторизации система должна вывести приветственное сообщение.

[вздыхает...] Ваши данные проверены, и о, чудо, они верны...
Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold". Хотя мне всё равно...
Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...]
Надеюсь, вам понравится пребывание здесь больше, чем мне.

 */