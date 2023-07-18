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


/*
Задача 3 к Уроку 2

Сайт с расписанием поездов получает данные с сервера.
Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них. Сервер прислал данные,
что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
 */