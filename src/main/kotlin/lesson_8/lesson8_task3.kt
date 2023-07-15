package lesson_8


fun main() {
    val ingredientsArray = arrayOf("соль", "сахар", "капуста", "лук", "масло", "лимон")

    print("Введите ингредиент: ")
    val userIngredient = readln()

    if (ingredientsArray.contains(userIngredient)) println("Ингредиент $userIngredient в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}