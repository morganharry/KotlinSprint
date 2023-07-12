package lesson_4

fun main() {
    val requiredSunny = true
    val requiredAwningOpen = true
    val requiredHumidity = 20
    val requiredSeason = "winter"

    val isSunny = true
    val isAwningOpen = true
    val nowHumidity = 20
    val nowSeason = "winter"

    val check =
        (isSunny == requiredSunny && isAwningOpen == requiredAwningOpen && nowHumidity == requiredHumidity && nowSeason == requiredSeason)

    println("Благоприятные ли условия сейчас для роста бобовых? $check")
}