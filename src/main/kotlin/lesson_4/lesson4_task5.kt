package lesson_4

fun main() {
    println("Корабль не имеет повреждений? (true/false)")
    val damage = readln().toBoolean()
    println("Текущий состав экипажа? (количество)")
    val numOfTeam = readln().toInt()
    println("Количество ящиков с провизией на борту? (количество)")
    val numOfFoods = readln().toInt()
    println("Благоприятность метеоусловий? (true/false)")
    val goodWeather = readln().toBoolean()

    val requiredDamageLongTrip = true
    val minNumOfTeamLongTrip = 55
    val maxNumOfTeamLongTrip = 70
    val minFoodsLongTrip = 50

    val NumOfTeamTrip = 70
    val minFoodsTrip = 50
    val requiredGoodWeatherTrip = true

    when {
        (damage == requiredDamageLongTrip && numOfTeam in (minNumOfTeamLongTrip..maxNumOfTeamLongTrip) && numOfFoods > minFoodsLongTrip) ->
            println("Научно-исследовательский корабль может приступить к долгосрочному плаванию.")

        (numOfTeam == NumOfTeamTrip && numOfFoods > minFoodsTrip && goodWeather == requiredGoodWeatherTrip) ->
            println("Научно-исследовательский корабль может отправиться в плавание.")

        else -> println("Научно-исследовательский корабль не может отправиться в плавание.")
    }
}
