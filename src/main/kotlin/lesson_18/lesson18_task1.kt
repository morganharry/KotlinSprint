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
/*
класс и функцию для которых не подразумевается создание объекта и реализация лучше сделать абстрактными

 чтобы не было заглушки*/
/*
Задача 1 к Уроку 18

CRM (система управления взаимоотношениями с клиентами) обрабатывает заказы в интернет-магазине. Заказ содержит информацию:
 номер заказа и товары.
Если товар один, он хранится в виде строки, если несколько – в виде списка строк.

По запросу нужно печатать в консоль сообщение «Заказан товар: [название_товара]» или «Заказаны следующие товары:
 [название_товара], … [название_товара]».
 Создай 2 объекта заказа и вызови у них метод вывода информации и заказе. Реши задачу, используя полиморфизм.*/