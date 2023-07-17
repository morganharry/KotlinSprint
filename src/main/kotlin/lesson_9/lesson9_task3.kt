package lesson_9

fun main() {
    val listAmtIngredients = mutableListOf(2, 50, 15)
    print("Укажите количество порций: ")
    val userNum = readln().toInt()
    val userListAmtIngredients = listAmtIngredients.map { it * userNum }

    println(
        "На $userNum порций вам понадобится:\n" +
                "Яиц – ${userListAmtIngredients[0]}, молока – ${userListAmtIngredients[1]}, сливочного масла – ${userListAmtIngredients[2]}]"
    )
}
