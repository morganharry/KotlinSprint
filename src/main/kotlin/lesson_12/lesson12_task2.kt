package lesson_12

class WeatherInf(_dayTemp: Int, _nightTemp: Int, _wasItRaining: Boolean, _atmospherePressure: Int) {
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
    val day1 = WeatherInf(41, 25, true, 755)
    day1.weatherView()

    val day2 = WeatherInf(31, 27, false, 754)
    day2.weatherView()

    val day3 = WeatherInf(37, 22, true, 753)
    day3.weatherView()
}