package lesson_20

fun main() {
    val listOfElement = listOf("1-Play", "2-Pause", "3-FF", "4-Rew", "5-Rec")
    val listOfClick = listOfElement.map { { it: String -> "Нажат элемент $it" }(it) }
    println(listOfClick.filterNot { (listOfClick.indexOf(it)) % 2 == 0 }.joinToString("\n"))
}
/*
мне кажется прибавление к индексу излишнее действие. отсчет нормально начинать с нуля */

/*
Задача 4 к Уроку 20

В разрабатываемом приложении мы реализуем список элементов. Изначально он представлен списком строк.
При помощи map преобразуй его в список лямбд, каждая из которых печатает в консоль: “Нажат элемент [название_элемента]”.

“Нажми” каждый четный элемент списка. */