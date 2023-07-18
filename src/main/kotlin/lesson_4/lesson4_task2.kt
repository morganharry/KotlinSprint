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
/*
Задача 2 к Уроку 4

При работе на таможенном терминале важно точно определить категорию каждого груза.
Напиши программу, которая проверяет, соответствует ли груз категории "Average".
Эта категория имеет следующие параметры: вес от 35 кг до 100 кг (включительно), и объем меньше 100 литров.

Создай программу, которая отображает соответствие данных груза категории "Average".
Вывод программы может выглядеть так: "Груз с весом 42 кг и объемом 120 л соответствует категории 'Average': false".

- укажи предварительно заданные параметры категории;
- проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
- сделай сравнение непосредственно внутри println() и без использования диапазонов.
 */
