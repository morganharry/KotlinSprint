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

/*
хорошая реализация)

давай сделаем еще лучше.
попробуй реализовать отсутствие повторов, используя коллекцию, которая не умеет хранить повторы. */

/*
Задача 5* к Уроку 9

Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).

 – результат должен исключать повторы;
 – список должен выводиться в алфавитном порядке;
 – все элементы списка выведены в одну строку, разделяя слова запятыми;
 – первое слово должно быть напечатано с заглавной буквы, в конце списка должна стоять точка. */