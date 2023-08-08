package lesson_12

class WeatherInformation (_dayTemp: Int, _nightTemp: Int, _wasItRaining: Boolean, _atmospherePressure: Int) {
    var dayTemp = _dayTemp
    var nightTemp = _nightTemp
    var wasItRaining = _wasItRaining
    var atmospherePressure = _atmospherePressure

    fun weatherView() {
        println("Дневная температура: $dayTemp°\nНочная температура: $nightTemp°\nОсадки: $wasItRaining\nАтм. давление: $atmospherePressure мм рт. ст.")
        println()
    }
}

fun main() {
    val day1 = WeatherInformation(41, 25, true, 755)
    day1.weatherView()

    val day2 = WeatherInformation(31, 27, false, 754)
    day2.weatherView()

    val day3 = WeatherInformation(37, 22, true, 753)
    day3.weatherView()
}

/*
Задача 2 к Уроку 12

Измени класс из прошлого задания (скопируй в файл с новым уроком и новым названием класса для избежания конфликтов).
Используй первичный конструктор, затем так же создай 3 объекта и выведи информацию о них. Поля должны быть объявлены
и проинициализированы в теле класса. */