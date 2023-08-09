package lesson_14

import kotlin.math.*

enum class Colors(val color: String) {
    GREEN("green"), RED("red"), BLACK("black"),
}

const val NUM_RAD_IN_DIAMETER = 2

abstract class Figure(
    val colorOfFigure: String,
) {
    abstract fun countPerimeter(): Int

    abstract fun countSquare(): Int
}

class Circle(
    colorOfFigure: String,
    val radius: Int,
) : Figure(colorOfFigure) {
    override fun countPerimeter(): Int {
        val perimeter = (NUM_RAD_IN_DIAMETER * radius * PI).toInt()
        return perimeter
    }

    override fun countSquare(): Int {
        val square = (radius * radius * PI).toInt()
        return square
    }
}

class Rectangle(
    colorOfFigure: String,
    val sideA: Int,
    val sideB: Int,
) : Figure(colorOfFigure) {
    override fun countPerimeter(): Int {
        val perimeter = sideA + sideB + sideA + sideB
        return perimeter
    }

    override fun countSquare(): Int {
        val square = sideA * sideB
        return square
    }
}

class Triangle(
    colorOfFigure: String,
    val sideA: Int,
    val sideB: Int,
    val sideC: Int,
) : Figure(colorOfFigure) {
    override fun countPerimeter(): Int {
        val perimeter = sideA + sideB + sideC
        return perimeter
    }

    override fun countSquare(): Int {
        val square =
            sqrt((countPerimeter() * (countPerimeter() - sideA) * (countPerimeter() - sideB) * (countPerimeter() - sideC)).toDouble()).toInt()
        return square
    }
}

fun main() {
    val circle1 = Circle(Colors.RED.color, 10)
    val circle2 = Circle(Colors.RED.color, 20)
    val rectangle1 = Rectangle(Colors.GREEN.color, 10, 20)
    val rectangle2 = Rectangle(Colors.BLACK.color, 25, 35)
    val triangle1 = Triangle(Colors.GREEN.color, 6, 8, 10)
    val triangle2 = Triangle(Colors.RED.color, 12, 16, 20)
    val listOfFigure = mutableListOf<Figure>()

    listOfFigure.add(circle1)
    listOfFigure.add(circle2)
    listOfFigure.add(rectangle1)
    listOfFigure.add(rectangle2)
    listOfFigure.add(triangle1)
    listOfFigure.add(triangle2)
    println(listOfFigure.map { it.colorOfFigure }.joinToString(", "))

    print("Выберите цвет фигур для расчета периметра (red/black/green): ")
    val colorForPer = readln().lowercase()
    if (colorForPer == Colors.RED.color || colorForPer == Colors.GREEN.color || colorForPer == Colors.BLACK.color) println(
        "Периметр всех фигур цвета $colorForPer равен: ${countAllFigWithColor(colorForPer, listOfFigure, true)}."
    )
    else println("Вы ввели неправильный цвет.")

    print("Выберите цвет фигур для расчета площади (red/black/green): ")
    val colorForSquare = readln().lowercase()
    if (colorForPer == Colors.RED.color || colorForPer == Colors.GREEN.color || colorForPer == Colors.BLACK.color) println(
        "Площадь всех фигур цвета $colorForSquare равна: ${countAllFigWithColor(colorForSquare, listOfFigure, false)}."
    )
    else println("Вы ввели неправильный цвет.")
}

fun countAllFigWithColor(color: String, list: MutableList<Figure>, isItPer: Boolean): Int {
    var sumAllFig = 0
    for (figure in list) {
        if (figure.colorOfFigure == color) if (isItPer) sumAllFig += figure.countPerimeter()
        else sumAllFig += figure.countSquare()
    }
    return sumAllFig
}

/*
а почему бы не сделать эти методы абстрактными?) сейчас эта реализация не несет никакого функционала

проблема с форматированием, можешь попробовать сделать автоформатирование

правильнее было бы вынести цвета в enum, иначе есть вероятность ошибиться в какой то из строк)

здесь тоже проблемы с форматированием, после двоеточия и других знаков должен идти пробел
*/
/*
Задача 5* к Уроку 14

Напиши программу, которая будет описывать геометрические фигуры: круг, прямоугольник и треугольник.
Все фигуры имеют свой цвет, а также свои индивидуальные параметры: у круга это радиус окружности; у прямоугольника –
 ширина и высота; у треугольника – длины каждой стороны.

 – создай абстрактный класс Figure с полем color;

 – у класса Figure определи два абстрактных метода: реализация первого метода должна возвращать площадь фигуры,
 а реализация второго – возвращать ее периметр;

 – создай 3 класса наследника для фигур ​Circle, Rectangle ​и Triangle​ с соответствующими полями;

 – в этих же классах, реализуй методы для каждой из геометрических фигур (формулы для вычисления площади
 и периметра можно нагуглить);

 – после этого создай по 2 объекта с различными цветами (красный, черный, зеленый) и произвольными размерами
 для каждой фигуры;

 – наконец, создай 2 метода: первый, принимая на вход список геометрических фигур, должен вернуть сумму периметров
 красных фигур; второй, также принимая на вход список, должен вернуть сумму площадей красных фигур;

 – вызови эти два метода с массивом созданных объектов фигур ​и выведи результат в консоль. */