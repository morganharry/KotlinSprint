package lesson_9

import java.util.*

fun main() {
    val userIngredientList = mutableListOf<String>()

    println("Введите ингредиенты.")
    for (i in 1..5) {
        var userIngredient = ""
        do {
            print("Ингредиент номер $i: ")
            userIngredient = readln()
        } while (userIngredient in userIngredientList)
        userIngredientList.add(userIngredient)
    }
    val sortedIngredientList: MutableList<String> = userIngredientList.sorted().toMutableList()

    sortedIngredientList[0] = sortedIngredientList[0].replaceFirstChar {it.titlecase(Locale.getDefault())}

    println("${sortedIngredientList.joinToString(",")}.")
}
/*
– список должен выводиться в алфавитном порядке;
– все элементы списка выведены в одну строку, разделяя слова запятыми;
– первое слово должно быть напечатано с заглавной буквы, в конце списка должна стоять точка.*/
