package lesson_16

const val NUM_FOR_PERIMETER = 2

private class Circle(private val radius: Int) {
    val pi = 3.14
    fun square() {
        val squareOfCircle = (pi * radius * radius).toInt()
        println("Площадь круга с радиусом $radius равна: $squareOfCircle")
    }

    fun perimeter() {
        val perimeterOfCircle = (NUM_FOR_PERIMETER * pi * radius).toInt()
        println("Длина окружности с радиусом $radius равна: $perimeterOfCircle")
    }
}

fun main() {
    print("Введите радиус окружности: ")
    val circle1 = Circle(readln().toInt())
    
    circle1.square()
    circle1.perimeter()
}