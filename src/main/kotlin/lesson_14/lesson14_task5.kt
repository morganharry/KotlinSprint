package lesson_14

import kotlin.math.*

const val NUM_RAD_IN_DIAMETER = 2
abstract class Figure(
    val color: String,
) {
    open fun countPerimeter():Int  {
        val perimeter = 0
        return perimeter
    }

    open fun countSquare():Int  {
        val square = 0
        return square
    }
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {
    override fun countPerimeter():Int {
        val perimeter =  (NUM_RAD_IN_DIAMETER * radius * PI).toInt()
        return perimeter
    }

    override fun countSquare():Int  {
        val square =(radius * radius * PI).toInt()
        return square
    }
}

class Rectangle (
    color: String,
    val sideA: Int,
    val sideB: Int,
) : Figure(color) {
    override fun countPerimeter():Int {
        val perimeter =  sideA + sideB + sideA + sideB
        return perimeter
    }

    override fun countSquare():Int  {
        val square = sideA * sideB
        return square
    }
}

class Triangle(
    color: String,
    val sideA: Int,
    val sideB: Int,
    val sideC: Int,
) : Figure(color) {
    override fun countPerimeter():Int {
        val perimeter =  sideA + sideB + sideC
        return perimeter
    }

    override fun countSquare():Int  {
        val square = sqrt((countPerimeter()*(countPerimeter()-sideA)*(countPerimeter()-sideB)*(countPerimeter()-sideC)).toDouble()).toInt()
        return square
    }
}

fun main() {
    val circle1 = Circle("red", 10)
    val circle2 = Circle("red", 20)
    val rectangle1 = Rectangle("green", 10, 20)
    val rectangle2 = Rectangle("red", 25, 35)
    val triangle1 = Triangle("red", 6, 8, 10)
    val triangle2 = Triangle("red", 12, 16, 20)
    val listOfFigure = mutableListOf<Figure>()

    listOfFigure.add(circle1)
    listOfFigure.add(circle2)
    listOfFigure.add(rectangle1)
    listOfFigure.add(rectangle2)
    listOfFigure.add(triangle1)
    listOfFigure.add(triangle2)

    print("Выберите цвет фигур для расчета периметра (red/black/green): ")
    val colorForPer = readln()
    if (colorForPer == "red" ||colorForPer == "black" ||colorForPer == "green")
        println("Периметр всех фигур цвета $colorForPer равен: ${countAllFigWithColor (colorForPer, listOfFigure, true)}.")
    else println("Вы ввели неправильный цвет.")

    print("Выберите цвет фигур для расчета площади (red/black/green): ")
    val colorForSquare = readln()
    if (colorForSquare == "red" ||colorForSquare == "black" ||colorForSquare == "green")
        println("Площадь всех фигур цвета $colorForSquare равна: ${countAllFigWithColor (colorForSquare, listOfFigure, false)}.")
    else println("Вы ввели неправильный цвет.")
}

fun countAllFigWithColor (color:String, list:MutableList<Figure>, per:Boolean):Int {
    var sumAllFig = 0
    if (per) for (figure in list) if(figure.color == color) sumAllFig += figure.countPerimeter()
    else for (figure in list) if(figure.color == color) sumAllFig += figure.countSquare()
    return sumAllFig
}