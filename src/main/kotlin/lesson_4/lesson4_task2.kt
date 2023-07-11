package lesson_4

fun main() {
    val minWeightAverage = 35
    val maxWeightAverage = 100
    val maxVolumeAverage = 100

    var weightCargo = 20
    var volumeCargo = 80
    println(
        "Груз с весом ${weightCargo} кг и объемом ${volumeCargo} л соответствует категории 'Average': " +
                "${weightCargo > minWeightAverage && weightCargo <= maxWeightAverage && volumeCargo < maxVolumeAverage}"
    )

    weightCargo = 50
    volumeCargo = 100
    println(
        "Груз с весом ${weightCargo} кг и объемом ${volumeCargo} л соответствует категории 'Average': " +
                "${weightCargo > minWeightAverage && weightCargo <= maxWeightAverage && volumeCargo < maxVolumeAverage}"
    )
}

