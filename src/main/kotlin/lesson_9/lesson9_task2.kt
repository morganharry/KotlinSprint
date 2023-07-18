package lesson_9

fun main() {
    val ingredientsList = mutableListOf("соль", "масло", "капуста")

    println("В рецепте есть базовые ингредиенты: ${ingredientsList.joinToString(",")}")
    print("Желаете добавить еще? ")
    if (readln().lowercase() == "да") {
        print("Какой ингредиент вы хотите добавить? ")
        val userIngredient = readln()
        ingredientsList.add(userIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: ${ingredientsList.joinToString(",")}")
    }
}