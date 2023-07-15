package lesson_8


fun main() {
    val ingredientsArray = arrayOf("соль", "сахар", "капуста", "лук", "масло", "лимон")

    print("Введите ингредиент: ")
    val userIngredient = readln()

    var isIt = false

    for (i in ingredientsArray.indices) {
        if (userIngredient == ingredientsArray[i]) isIt = true
    }

    if (isIt) println("Ингредиент $userIngredient в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}