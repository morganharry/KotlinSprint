package lesson_12

class WeatherInfo(
    var dayTemp: Int,
    var nightTemp: Int,
    var wasItRaining: Boolean = false,
    var atmospherePressure: Int
) {
    init {
        println("Дневная тепература: $dayTemp°\nНочная температура: $nightTemp°\nОсадки: $wasItRaining\nАтм. давление: $atmospherePressure мм рт. ст.")
        println()
    }
}

fun main() {
    val day1 = WeatherInfo(41, 25, atmospherePressure = 755)
    val day2 = WeatherInfo(31, 27, true, 754)
    val day3 = WeatherInfo(37, 22, atmospherePressure = 755)
}