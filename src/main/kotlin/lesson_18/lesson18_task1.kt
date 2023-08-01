package lesson_18

abstract class Order() {
    abstract fun getOrder(): String
}

class OnceOrder(val num: Int, private val order: String) : Order() {
    override fun getOrder(): String {
        return ("Заказан товар: $order")
    }
}

class FewOrders(val num: Int, private val order: List<String>) : Order() {
    override fun getOrder(): String {
        return ("Заказаны следующие товары: ${order.joinToString(", ")}")
    }
}

fun main() {
    val order1: Order = OnceOrder(1, "Утюг")
    val order2: Order = FewOrders(2, listOf("Холодильник", "Телевизор", "Пылесос"))

    val listOfOrder = listOf<Order>(order1, order2)
    showAllOrders(listOfOrder)
}

fun showAllOrders(listOfOrder: List<Order>) {
    listOfOrder.forEach {
        println(it.getOrder())
    }
}