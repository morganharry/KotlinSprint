package lesson_4

const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_AVERAGE = 100
const val MAX_VOLUME_AVERAGE = 100

fun main() {
    var weightCargo = 20
    var volumeCargo = 80
    println(
        "Груз с весом ${weightCargo} кг и объемом ${volumeCargo} л соответствует категории 'Average': " +
                "${weightCargo > MIN_WEIGHT_AVERAGE && weightCargo <= MAX_WEIGHT_AVERAGE && volumeCargo < MAX_VOLUME_AVERAGE}"
    )

    weightCargo = 50
    volumeCargo = 100
    println(
        "Груз с весом ${weightCargo} кг и объемом ${volumeCargo} л соответствует категории 'Average': " +
                "${weightCargo > MIN_WEIGHT_AVERAGE && weightCargo <= MAX_WEIGHT_AVERAGE && volumeCargo < MAX_VOLUME_AVERAGE}"
    )
}

/*
Корректно, предлагаю еще создать константы для значений, с которым сравниваем входные данные
 */

