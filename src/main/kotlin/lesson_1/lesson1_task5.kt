package lesson_1

fun main() {
    val sumOfSeconds = 6480
    val secInMin = 60
    val numOfMinuts = sumOfSeconds / secInMin
    val numOfSeconds = sumOfSeconds % secInMin
    println("$numOfMinuts:${String.format("%02d", numOfSeconds)}")
}
