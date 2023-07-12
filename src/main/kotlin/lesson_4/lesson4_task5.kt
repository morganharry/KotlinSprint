package lesson_4

const val NO_DAMAGE = true
const val MIN_TEAM = 55
const val MAX_TEAM = 70
const val MIN_FOOD = 50
const val GOOD_WEATHER = true

fun main() {
    println("Корабль поврежден? (true/false)")
    val isDamage = readln().toBoolean()
    println("Текущий состав экипажа? (количество)")
    val numOfTeam = readln().toInt()
    println("Количество ящиков с провизией на борту? (количество)")
    val numOfFood = readln().toInt()
    println("Благоприятность метеоусловий? (true/false)")
    val isGoodWeather = readln().toBoolean()


    when {
        (isDamage != NO_DAMAGE && numOfTeam in (MIN_TEAM..MAX_TEAM) && numOfFood > MIN_FOOD) ->
            println("Научно-исследовательский корабль может приступить к долгосрочному плаванию.")

        (numOfTeam == MAX_TEAM && numOfFood > MIN_FOOD && isGoodWeather == GOOD_WEATHER) ->
            println("Научно-исследовательский корабль может отправиться в плавание.")

        else -> println("Научно-исследовательский корабль не может отправиться в плавание.")
    }
}
