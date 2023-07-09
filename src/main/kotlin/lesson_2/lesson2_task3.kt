package lesson_2

fun main() {
    val hoursOfDeparture = 9
    val minutesOfDeparture = 39
    val travelTimeInMin = 457
    val minInHour = 60

    val minutesOfArrival = (minutesOfDeparture + travelTimeInMin) % minInHour
    val hoursOfArrival= hoursOfDeparture + (minutesOfDeparture + travelTimeInMin) / minInHour

    println (String.format("%02d:%02d", hoursOfArrival, minutesOfArrival))
}
