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

/*
Задача 5* к Уроку 12

Продолжи усовершенствовать программу, теперь она должна рассчитывать средние значения температур и давления,
и считать количество дождливых дней. Представь, что данные ты получаешь от датчиков и сымитируй их поведение с помощью random.

 – в функции main() создай список и добавь в него с помощью цикла 10 объектов класса, передав в конструкторы случайные значения;
 – для расчета среднего значения температуры создай переменные;
 – пройдись циклом по элементам созданного списка и вычисли средние значения температур, а также количество дождливых дней
 –  выведи результаты в консоль. На выходе должны получиться средние значения по температуре днем, ночью и по среднему атмосферному давлению. */