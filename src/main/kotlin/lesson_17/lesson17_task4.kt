package lesson_17

class Package(val num: Int, _place: String, var count: Int = 0) {
    var place = _place
        set(value) {
            field = value
            count++
        }

    fun setNewPlace() {
        print("Укажите новое местоположение посылки №$num: ")
        place = readln()
    }

    fun getInfo() {
        println("Посылка №$num, местоположение $place, счётчик:$count. ")
    }
}

fun main() {
    val package1 = Package(45, "Москва")
    package1.getInfo()
    package1.setNewPlace()
    package1.getInfo()
}