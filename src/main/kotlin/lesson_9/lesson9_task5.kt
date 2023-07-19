package lesson_9

import java.util.*

fun main() {
    val userIngredientList = mutableSetOf<String>()

    println("Введите ингредиенты.")
    for (i in 1..5) {
        print("Ингредиент номер $i: ")
        userIngredientList.add(readln())
    }

    val sortedIngredientList: MutableList<String> = userIngredientList.sorted().toMutableList()

    sortedIngredientList[0] = sortedIngredientList[0].replaceFirstChar { it.titlecase(Locale.getDefault()) }

    println("${sortedIngredientList.joinToString(",")}.")
}