package lesson_17


class User(
    _login: String,
    _psw: String,
) {
    var login: String = _login
        get() = field
        set(value) {
            field = value
            println("Вы изменили логин на $field")
        }
    var psw: String = _psw
        get() {
            var pswSecret = ""
            repeat(field.length) { pswSecret += "*" }
            return (pswSecret)
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user1 = User("Boris1985", "123456")
    print("Введите новый логин: ")
    user1.login = readln()
    print("Введите новый пароль: ")
    user1.psw = readln()
    print("Действующий пароль: ${user1.psw}")
    user1.psw
}