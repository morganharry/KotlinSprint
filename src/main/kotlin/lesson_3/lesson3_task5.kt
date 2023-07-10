package lesson_3

fun main() {
    val move = "D2-D4;22"
    val startMove = move.substring(0, 2)
    val endMove = move.substring(3, 5)
    val numMove = move.substring(6)

    println("$startMove-$endMove;$numMove")
}