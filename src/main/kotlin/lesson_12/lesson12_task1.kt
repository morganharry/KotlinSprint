package lesson_12

class Weather() {
    var dayTemp: Int = 0
    var nightTemp: Int = 0
    var wasItRaining: Boolean = false
    var atmospherePressure: Int = 0

    fun weatherView() {
        println("Дневная тепература: $dayTemp°\nНочная температура: $nightTemp°\nОсадки: $wasItRaining\nАтм. давление: $atmospherePressure мм рт. ст.")
        println()
    }
}

fun main() {
    val day1 = Weather()
    day1.dayTemp = 39
    day1.nightTemp = 21
    day1.atmospherePressure = 755

    day1.weatherView()

    val day2 = Weather()
    day2.dayTemp = 37
    day2.nightTemp = 25
    day2.wasItRaining = true
    day2.atmospherePressure = 755

    day2.weatherView()
}