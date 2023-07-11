package lesson_4

fun main() {
    val requiredSun = true
    val requiredAwning = true
    val requiredHumidity = 20
    val requiredSeason = "winter"

    val nowSun = true
    val nowAwning = true
    val nowHumidity = 20
    val nowSeason = "winter"

    val check =
        (nowSun == requiredSun && nowAwning == requiredAwning && nowHumidity == requiredHumidity && nowSeason == requiredSeason)

    println("Благоприятные ли условия сейчас для роста бобовых? $check")
}