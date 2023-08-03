package lesson_19

enum class Category(val nameCat: String) {
    CLOTHES("Одежда"),
    STATIONERY("Канцелярские товары"),
    MISCELLANEOUS("Разное")
}

class Product(val name: String, val id: Int, val category: Category) {
    fun getInfoAbout() {
        println("Товар №$id - $name из категории \"${category.nameCat}\"")
    }
}

fun main() {
    val product1 = Product("Рубашка", 55, Category.CLOTHES)
    val product2 = Product("Бумага", 535, Category.STATIONERY)
    val product3 = Product("Лампочка", 155, Category.MISCELLANEOUS)

    val listOfProduct = listOf<Product>(product1, product2, product3)

    listOfProduct.forEach { it.getInfoAbout() }
}