package lesson_1

fun main() {
    val year = 1961
    var hour = "09"
    var minute = "07"
    println(year)
    println(hour)
    println(minute)
    hour = "10"
    minute = "55"
    println(hour + ':' + minute)
}

/*
все корректно!
на будущее рекомендую использовать вместо конкатенации - интерполяцию. но сейчас это не требование к тз, тк пока не по уровню урока
 */