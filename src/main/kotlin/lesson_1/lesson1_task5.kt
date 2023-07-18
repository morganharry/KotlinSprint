package lesson_1

fun main() {
    val sumOfSeconds = 6480
    val secInMin = 60
    val numOfMinutes = sumOfSeconds / secInMin
    val numOfSeconds = sumOfSeconds % secInMin
    println("$numOfMinutes:${String.format("%02d", numOfSeconds)}")
}

/*
Задача 5* к Уроку 1

Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
 */