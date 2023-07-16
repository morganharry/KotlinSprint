package lesson_9

fun main() {
    print("Введите пять наименований ингредиентов, разделяя их запятыми: ")
    val userIngredientList = readln().split(",")

    println(userIngredientList.sorted().joinToString(","))
}