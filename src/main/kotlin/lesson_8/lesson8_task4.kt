package lesson_8

fun main() {
    val ingredientsArray = arrayOf("соль", "сахар", "капуста", "лук", "масло", "лимон")

    println("Список ингредиентов: ${ingredientsArray.joinToString(",")}.")
    print("Какой ингридиент вы хотите заменить? ")
    val userIngredientFrom = readln()

    if (!ingredientsArray.contains(userIngredientFrom)) println("Такого ингредиента в рецепте нет")
    else {
        print("На какой ингридиент вы хотите заменить? ")
        val userIngredientTo = readln()
        val numElement = ingredientsArray.indexOf(userIngredientFrom)
        ingredientsArray[numElement] = userIngredientTo
        println("Список ингредиентов: ${ingredientsArray.joinToString(",")}.")
    }
}