package lesson_16

class Order(val num: Int, private var status: String) {

    fun printInfo() {
        println("Заказ $num в статусе $status")
    }

    fun changeNum(_status: String) {
        status = _status
    }
}

fun main() {
    val order1 = Order(937, "на сборке")
    order1.printInfo()
    changeNumOrder(order1)
    order1.printInfo()
}

fun changeNumOrder(order1: Order) {
    print("Для смены статуса заказа ${order1.num} необходимо направить заявку менеджеру. Направить? (да/нет): ")
    if (readln().equals("да", true)) {
        print("Какой статус приствоить заказу ${order1.num}? ")
        val status = readln()
        order1.changeNum(status)
    }
}