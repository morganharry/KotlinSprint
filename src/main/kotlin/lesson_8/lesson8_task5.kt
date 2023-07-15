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