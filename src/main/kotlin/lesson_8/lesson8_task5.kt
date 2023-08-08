package lesson_8

fun main() {
    print("Сколько ингридиентов в вашем рецепте? ")
    val numOfIngredient = readln().toInt()
    var ingredientsArray = arrayOf<String>()

    for (i in 0 until numOfIngredient) {
        print("Какой ингридиент вы хотите добавить? ")
        val userIngredientTo = readln()
        ingredientsArray += userIngredientTo
    }
    println("Готово! Вы сохранили следующий список: ${ingredientsArray.joinToString(",")}.")
}

/*
Все корректно!
А еще можно сразу объявлять и инициализировать массив через лямбду
val array = Array(readln().toInt()) { readln() }
 */

/*
Задача 5* к Уроку 8

Напиши программу, которая должна создавать массив из определенного количества ингредиентов,
которые будет вводить пользователь.
 Элементы вводятся по одному.
 Перед вводом элементов сначала запрашивается количество планируемых ингредиентов.*/