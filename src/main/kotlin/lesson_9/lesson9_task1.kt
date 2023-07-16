package lesson_9

fun main() {
    val ingredientsList = listOf("соль", "сахар", "масло", "капуста", "лимон", "лук")

    println("В рецепте есть следующие ингредиенты:\n${ingredientsList.joinToString("\n")}")
}