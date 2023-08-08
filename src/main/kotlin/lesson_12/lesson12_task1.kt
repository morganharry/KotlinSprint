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

/*
Задача 1 к Уроку 12

Создай класс для программы, отслеживающей погоду. Объекты класса будут хранить температуру днем и ночью, был ли дождь,
 атмосферное давление. В этом задании нужно использовать пустой конструктор.

Создай два объекта, присвой им произвольные данные и выведи в консоль одним методом созданного класса.
 – в классе создай переменные и проинициализируй их какими-нибудь значениями;
 – затем в объектах подставь другие значения этим переменным. */