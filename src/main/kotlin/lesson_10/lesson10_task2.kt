package lesson_10

const val MIN_LENGTH = 4
fun checkLoginAndPasswordLength(str: String) = if (str.length < MIN_LENGTH) {
    println("Логин или пароль недостаточно длинные")
    true
} else {
    println("Логин или пароль одобрены")
    false
}

fun main() {
    do {
        print("Придумайте и введите логин: ")
        val userLogin = readln()
    } while (checkLoginAndPasswordLength(userLogin))

    do {
        print("Придумайте и введите пароль: ")
        val userPsw = readln()
    } while (checkLoginAndPasswordLength(userPsw))
}


/*
Более распространенной хорошей практикой является использование глагола в названии методов.
Например, checkLoginAndPasswordLength()

предлагаю здесь сразу возвращать результат условия без использования return

без return:
fun checkLoginAndPasswordLength (str: String) = (str.length < MIN_LENGTH)
Но вот куда println в таком случае деть? Обратно в цикл бессмысленно.
Ума не приложу, как без return вывод еще оставить в функции. I need help.

if тоже умеет возвращать результаты условий внутри себя)

fun loginAndPswChecker(str: String) = if (str.length < MIN_LENGTH) {
    println("Логин или пароль недостаточно длинные")
    true
} else {
    println("Логин или пароль одобрены")
    false
}

 */

/*
Задача 2 к Уроку 10

Для регистрации в приложении пользователь придумывает логин и пароль.
И пароль, и логин должны содержать в себе хотя бы 4 символа. Если всё верно, программа выводит приветственное сообщение.

 – логин и пароль должны считываться с консоли;
 – проверку длины логина или пароля вынеси в отдельную функцию, которая валидирует длину пароля;
 – если пароль меньше 4 символов – вывести сообщение: "Логин или пароль недостаточно длинные". */