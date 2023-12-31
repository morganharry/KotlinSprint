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
        println("Готово! Вы сохранили следующий список: ${ingredientsArray.joinToString(",")}.")
    }
}

/*
Задача 4 к Уроку 8

Представим, что мы получили массив ингредиентов.
Программа должна распечатать весь список ингредиентов,
затем заменить нужный ингредиент на новый по желанию пользователя.
 После этого программа должна показать обновленный список.

 – создай массив со списком ингредиентов и напечатай его в консоль;
 – запроси у пользователя информацию об ингредиенте, который он хочет заменить;
 – если пользователь ввел ингредиент, которого нет в списке, вывести соответствующее сообщение;
 – если есть, запроси ингредиент, который пользователь хотел бы добавить;
 – выведи обновленный список с сообщением: “Готово! Вы сохранили следующий список: [список_ингредиентов]”.
*/