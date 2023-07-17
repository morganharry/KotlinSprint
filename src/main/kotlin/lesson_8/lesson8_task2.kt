package lesson_8

fun main() {
    val ingredientsArray = arrayOf("соль", "сахар", "капуста", "лук", "масло", "лимон")

    print("Введите ингредиент: ")
    val userIngredient = readln()

    for (ingredient in ingredientsArray) {
        if (userIngredient == ingredient) {
            println("Ингредиент $userIngredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}