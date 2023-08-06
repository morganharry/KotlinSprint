package lesson_20

fun main() {
    val listOfElement = listOf("1-Play", "2-Pause", "3-FF", "4-Rew", "5-Rec")
    val listOfClick = listOfElement.map { { it: String -> "Нажат элемент $it" }(it) }
    println(listOfClick.filterNot { (listOfClick.indexOf(it)) % 2 == 0 }.joinToString("\n"))
}