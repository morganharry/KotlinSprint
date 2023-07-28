package lesson_15

import kotlin.math.*

const val MAX_OF_PASS_TRUCK = 1
const val MAX_OF_PASS_CAR = 3
const val MAX_OF_GOODS_TRUCK = 2

const val CORR_TO_NUM = 1

interface Moving {
    fun move()
}

interface TransportationOfPass {
    fun transportOfPass(num: Int)
}

interface TransportationOfGoods {
    fun transportOfGoods(num: Int)
}

abstract class Transport(
    val name: String,
    var isMove: Boolean,
    var numOfPass: Int,
)

class Truck(name: String, isMove: Boolean = false, numOfPass: Int, var numOfGoods: Int) :
    Transport(name, isMove, numOfPass), Moving, TransportationOfPass, TransportationOfGoods {
    override fun move() {
        isMove = true
        println("Транспорт $name выехал: ")
    }

    override fun transportOfPass(_numOfPass: Int) {
        numOfPass = _numOfPass
        println("- везёт $numOfPass чел.")
        println()
    }

    override fun transportOfGoods(_numOfGoods: Int) {
        numOfGoods = _numOfGoods
        println("- везёт ${numOfGoods}т груза$")
    }
}

class Car(name: String, isMove: Boolean = false, numOfPass: Int) : Transport(name, isMove, numOfPass), Moving,
    TransportationOfPass {
    override fun move() {
        isMove = true
        println("Транспорт $name выехал: ")
    }

    override fun transportOfPass(_numOfPass: Int) {
        numOfPass = _numOfPass
        println("- везёт $numOfPass чел.")
        println()
    }
}

fun main() {
    val listUserTrucks = getTrucks()
    val listUserCars = getCars()

    val maxPass = listUserTrucks.size * MAX_OF_PASS_TRUCK + listUserCars.size * MAX_OF_PASS_CAR
    val maxGoods = listUserTrucks.size * MAX_OF_GOODS_TRUCK

    val userPass = getPass(maxPass)
    val userGoods = getGoods(maxGoods)

    val userPassForCar = carryTruck(userPass, userGoods, listUserTrucks)
    if (userPassForCar > 0) carryCar(userPassForCar, listUserCars)
}

fun carryTruck(userPass: Int, userGoods: Int, listUserTrucks: MutableList<Truck>): Int {
    var count = 0
    var userGoodsCount = userGoods
    var userPassCount = userPass

    while (userGoodsCount > 0) {
        listUserTrucks[count].move()
        listUserTrucks[count].transportOfGoods(min(userGoodsCount, MAX_OF_GOODS_TRUCK))
        userGoodsCount = userGoodsCount - MAX_OF_GOODS_TRUCK
        if (userPassCount > 0) {
            listUserTrucks[count].transportOfPass(min(userPassCount, MAX_OF_PASS_TRUCK))
            userPassCount = userPassCount - MAX_OF_PASS_TRUCK
        } else listUserTrucks[count].transportOfPass(0)
        count++
    }
    return userPassCount
}

fun carryCar(userPassForCar: Int, listUserCars: MutableList<Car>) {
    var count = 0
    var userPassCount = userPassForCar

    while (userPassCount > 0) {
        listUserCars[count].move()
        listUserCars[count].transportOfPass(min(userPassCount, MAX_OF_PASS_CAR))
        userPassCount = userPassCount - MAX_OF_PASS_CAR
        count++
    }
}

fun getPass(maxPass: Int): Int {
    var userPass = 0

    do {
        print("Введите количество человек, которое вы хотите перевезти, но не более $maxPass: ")
        userPass = readln().toInt()
        if (userPass > maxPass) println("К сожалению, компания может перевезти максиум $maxPass пассажиров.")
        else break
    } while (true)
    return userPass
}

fun getGoods(maxGoods: Int): Int {
    var userGoods = 0

    do {
        print("Введите количчество тон груза,которое вы хотите перевезти, но не более $maxGoods: ")
        userGoods = readln().toInt()
        if (userGoods > maxGoods) println("К сожалению, компания может перевезти максиум $maxGoods тон груза.")
        else break
    } while (true)
    return userGoods
}

fun getTrucks(): MutableList<Truck> {
    val listTrucks = mutableListOf<Truck>()

    print("Введите количество имеющихся грузовиков: ")
    val userTrucks = readln().toInt()

    repeat(userTrucks) {
        listTrucks.add(Truck("truck_#${CORR_TO_NUM + it}", numOfPass = 0, numOfGoods = 0))
    }
    return listTrucks
}

fun getCars(): MutableList<Car> {
    val listCars = mutableListOf<Car>()

    print("Введите количество имеющихся машин: ")
    val userCars = readln().toInt()

    repeat(userCars) {
        listCars.add(Car("car_#${CORR_TO_NUM + it}", numOfPass = 0))
    }
    return listCars
}