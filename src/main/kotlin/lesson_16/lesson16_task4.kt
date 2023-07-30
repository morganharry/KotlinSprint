package lesson_16

class Order(val num: Int, private var status: String) {

    fun printInfo() {
        println("Заказ $num в статусе $status")
    }

    private fun changeStatus(_status: String) {
        print(
            "Уважаемый менеджер, к вам поступила заявка на изменение статуса заказа $num на $_status.\n" +
                    "Присвоить новый статус заказу? "
        )
        if (readln().equals("да", true)) status = _status
    }

    fun changeOrder() {
        print(
            "Уважаемый покупатель, если вы желаете сменить статуса заказа $num, то вам необходимо направить заявку менеджеру.\n" +
                    "Направить? (да/нет): "
        )
        if (readln().equals("да", true)) {
            print("Какой новый статус вы бы хотели, чтобы прсивоили заказу? ")
            changeStatus(readln())
        }
    }
}

fun main() {
    val order1 = Order(937, "на сборке")
    order1.printInfo()
    order1.changeOrder()
    order1.printInfo()
}