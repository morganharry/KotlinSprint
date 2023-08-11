package lesson_18

abstract class Screen() {
    abstract fun draw()
}

class Point(val coordX: Float, val coordY: Float) : Screen() {
    override fun draw() {
        println("Нарисована точка с координатами ($coordX;$coordY).")
    }
}

class Circle(val coordX: Float, val coordY: Float, val radius: Float) : Screen() {
    override fun draw() {
        println("Нарисован круг с центром в точке с координатами ($coordX;$coordY) и радиусом $radius.")
    }
}

class Square(val coordX: Float, val coordY: Float, val size: Float) : Screen() {
    override fun draw() {
        println("Нарисован квадрат из точки с координатами ($coordX;$coordY) и стороной $size.")
    }
}

fun main() {
    val listOfScreen = mutableListOf<Screen>()

    do {
        print("Какую фигуру вы хотите нарисовать? (точка/круг/квадрат): ")
        val userChoose = readln()
        when {
            userChoose.equals("точка", true) -> {
                print(
                    "Укажите через пробел следующие данные - координаты точки по оси X,координаты точки по оси Y" +
                            " (как разделитель целой части от дробной используйте точку: "
                )
                val userInput = readln().split(" ").map { it.toFloat() }.toMutableList()
                val point: Screen = Point(userInput[0], userInput[1])
                listOfScreen.add(point)
            }

            userChoose.equals("круг", true) -> {
                print(
                    "Укажите через пробел следующие данные - координаты точки по оси X,координаты точки по оси Y, радиус круга" +
                            " (как разделитель целой части от дробной используйте точку: "
                )
                val userInput = readln().split(" ").map { it.toFloat() }.toMutableList()
                val circle: Screen = Circle(userInput[0], userInput[1], userInput[2])
                listOfScreen.add(circle)
            }

            userChoose.equals("квадрат", true) -> {
                print(
                    "Укажите через пробел следующие данные - координаты точки по оси X,координаты точки по оси Yб сторону квадрата" +
                            " (как разделитель целой части от дробной используйте точку: "
                )
                val userInput = readln().split(" ").map { it.toFloat() }.toMutableList()
                val square: Screen = Square(userInput[0], userInput[1], userInput[2])
                listOfScreen.add(square)
            }

            else -> println("Некорректный ввод")
        }

        listOfScreen.forEach { it.draw() }

        print("Продожить рисование? (да/нет): ")
    } while (readln().equals("да", true))
}
/*
Задача 5* к Уроку 18

В приложении есть экран. Мы можем рисовать в нем разные объекты, указывая координаты (x, y) и сам объект.
Объектами выступают круг, квадрат и точка. Координаты могут быть как Int, так и Float.

Реализуй классы точки, квадрата и круга, а также класс Screen со всеми перегруженными методами draw(...).*/