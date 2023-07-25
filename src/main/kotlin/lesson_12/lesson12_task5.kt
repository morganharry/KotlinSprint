package lesson_12

class WeatherInf(
    var dayTemp: Int,
    var nightTemp: Int,
    var wasItRaining: Boolean = false,
    var atmospherePressure: Int
) {
    init {
        println("Дневная тепература: $dayTemp°\n" +
                "Ночная температура: $nightTemp°\n" +
                "осадки: $wasItRaining\n" +
                "Атм. давление: $atmospherePressure мм рт. ст.")
        println()
    }
}

fun main() {
    val weatherList = mutableListOf<WeatherInf>()
    repeat(10) {
        val day = WeatherInf((25..45).random(), (20..35).random(), (0..1).random() == 1, (730..765).random())
        weatherList.add(day)
    }
    var averageDayTemp = 0
    var averageNightTemp = 0
    var numOfRainyDays = 0
    var averageAtmospherePressure = 0
    var count = 0

    for (day in weatherList) {
        averageDayTemp += day.dayTemp
        averageNightTemp += day.nightTemp
        if (day.wasItRaining) numOfRainyDays++
        averageAtmospherePressure += day.atmospherePressure
        count++
    }
    averageDayTemp /= count
    averageNightTemp /= count
    averageAtmospherePressure /= count
    println("Средняя температура днем: ${averageDayTemp}°\n" +
            "Средняя температура ночью: ${averageNightTemp}°\n" +
            "Количество дождливых дней: ${numOfRainyDays}\n" +
            "Среднее атмосферное давление: ${averageAtmospherePressure} мм рт. ст.")
}