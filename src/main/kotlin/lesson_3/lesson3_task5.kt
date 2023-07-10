package lesson_3

fun main() {
    val move = "D2-D4;22"
    val listMoveNum = move.split("-", ";")
    val startMove = listMoveNum.first()
    val endMove = listMoveNum[1]
    val numMove = listMoveNum.last()

    println("$startMove-$endMove;$numMove")
}