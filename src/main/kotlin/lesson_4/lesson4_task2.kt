package lesson_4

fun main() {
    val minWeightAverage = 35
    val maxWeightAverage = 100
    val maxVolumeAverage = 100

    var weightСargo = 20
    var volumeСargo = 80
    println(
        "Груз с весом ${weightСargo} кг и объемом ${volumeСargo} л соответствует категории 'Average': " +
                "${(weightСargo > minWeightAverage && weightСargo <= maxWeightAverage && volumeСargo < maxVolumeAverage)}"
    )

    weightСargo = 50
    volumeСargo = 100
    println(
        "Груз с весом ${weightСargo} кг и объемом ${volumeСargo} л соответствует категории 'Average': " +
                "${(weightСargo > minWeightAverage && weightСargo <= maxWeightAverage && volumeСargo < maxVolumeAverage)}"
    )
}

