package lesson_19

enum class Category() {
    CLOTHES {
        override fun getNameInRus(): String {
            return "Одежда"
        }
    },
    STATIONERY {
        override fun getNameInRus(): String {
            return "Канцелярские товары"
        }
    },
    MISCELLANEOUS {
        override fun getNameInRus(): String {
            return "Разное"
        }
    };

    abstract fun getNameInRus(): String
}

class Product(val name: String, val id: Int, val category: Category) {
    fun getInfoAbout() {
        println("Товар №$id - $name из категории \"${category.getNameInRus()}\"")
    }
}

fun main() {
    val product1 = Product("Рубашка", 55, Category.CLOTHES)
    val product2 = Product("Бумага", 535, Category.STATIONERY)
    val product3 = Product("Лампочка", 155, Category.MISCELLANEOUS)

    val listOfProduct = listOf<Product>(product1, product2, product3)

    listOfProduct.forEach { it.getInfoAbout() }
}