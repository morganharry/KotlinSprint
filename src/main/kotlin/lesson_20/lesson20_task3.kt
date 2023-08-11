package lesson_20

class Player(val name: String, var doesHeHaveAKey: Boolean = false)

fun main() {
    val player1 = Player("Larry")
    println("Игрок перед закрытой дверью.")
    val checkKey =
        { it: Player -> if (it.doesHeHaveAKey) println("Дверь открыта!") else println("Дверь заперта!") }
    checkKey(player1)
    println("Игрок волшебный образом находит ключ.")
    player1.doesHeHaveAKey = true
    checkKey(player1)
}
/*
it.doesHeHaveAKey уже содержит Boolean переменную, нет необходимости сравнивать это с true/false

наличие этой строки ни на что не влияет, что-то тут не так)
 */

/*
Задача 3 к Уроку 20

В игре есть запертая дверь. Игрок должен найти ключ. Нужно написать лямбда-функцию, которая будет проверять, есть ли у игрока ключ.
 Если ключ есть, нужно вывести сообщение, что игрок дверь открыл, иначе – что дверь заперта.

Для проверки работы функции нужно написать класс игрока, в котором будет храниться информация о наличии ключа. */
