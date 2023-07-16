package lesson_8

fun main() {
    val ingredientsArray = arrayOf("соль", "сахар", "капуста", "лук", "масло", "лимон")

    print("Введите ингредиент: ")
    val userIngredient = readln()

    var isIt = false

    for (ingredient in ingredientsArray) {
        if (userIngredient == ingredient) {
            isIt = true
            println("Ингредиент $userIngredient в рецепте есть")
            break
        }
    }
    if (!isIt) println("Такого ингредиента в рецепте нет")
}