package lesson_1

fun main() {
    val sumOfSeconds = 6480
    val secInMin = 60
    val numOfMinutes = sumOfSeconds / secInMin
    val numOfSeconds = sumOfSeconds % secInMin
    println("$numOfMinutes:${String.format("%02d", numOfSeconds)}")
}
