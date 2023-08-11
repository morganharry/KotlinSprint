package lesson_19

enum class Category(val nameCategory: String) {
    CLOTHES("Одежда"),
    STATIONERY("Канцелярские товары"),
    MISCELLANEOUS("Разное")
}

class Product(val name: String, val id: Int, val category: Category) {
    fun getInfoAbout() {
        println("Товар №$id - $name из категории \"${category.nameCategory}\"")
    }
}

fun main() {
    val product1 = Product("Рубашка", 55, Category.CLOTHES)
    val product2 = Product("Бумага", 535, Category.STATIONERY)
    val product3 = Product("Лампочка", 155, Category.MISCELLANEOUS)

    val listOfProduct = listOf<Product>(product1, product2, product3)

    listOfProduct.forEach { it.getInfoAbout() }
}
/*
этот enum можно упростить как и в прошлом задании */
/*
Задача 2 к Уроку 19

В интернет-магазине товары делятся на несколько категорий: одежда, канцелярские товары и разное.

 – создай enum класс с категориями;
 – создай метод, который примет тип категории и вернет текстовое название категории для пользователя;
 – создай класс, описывающий товар (с полями название, id, категория), в классе должен быть метод, который выводит инфо о товаре.
  Вызови его для нескольких созданных товаров;
 – для вывода информации о товаре, для категории используй метод определения категории. */