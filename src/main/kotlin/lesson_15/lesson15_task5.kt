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
/*
Вопрос по задаче.

Вижу два класса:

Автомобиль (имя, статус движения, кол-во пассажиров), методы: ехать, везти пассажиров.
Грузовик (имя, статус движения, кол-во пассажиров, кол-во груза), методы: ехать, везти пассажиров, везти груз.
Объединяю оба класса в один родительский: Транспорт (имя, статус движения, кол-во пассажиров), методы: ехать, везти пассажиров.
Параметры и методы Автомобиля и Транспорта полностью совпадают -> ничего не делаю. Параметры и методы Грузовика и
Транспорта совпадают частично ->
добавляю свойство "кол-во груза" в свойства подкласса, а метод "везти груз" в методы подкласса.

Все работает и я не понимаю - зачем мне в этом случае нужен интерфейс? Т.е. для меня понятно, если количество классов возрастет,
 и некоторые подклассы будут иметь общие методы, тогда действительно если их объединять в интерфейсах - это оптимально.
 А конкретно в этой задаче - не понимаю. Подскажи, пожалуйста.
 ------------

допустим у нас есть разные модели грузовиков и все они не могут перевозить пассажиров, тогда функция перевозки пассажиров будет сбивать с толку,
 так как по факту работать она не будет)

таким же образом можно придумать и другие методы специфичные для грузовиков и в случае использования одного абстрактного
класса он у нас очень сильно разрастется и будет сложно понять что к чему относится)

конкретно в данной задаче это может и не так обязательно, но придает наглядности и улучшает читаемость кода */

/*
Задача 5* к Уроку 15

В компьютерной игре есть грузовые и легковые автомобили. Напиши интерфейсы, обеспечивающие передвижение машин,
перевозку пассажиров и перевозку грузов. Грузовые машины могут перевозить одного пассажира и 2 тонны груза, легковые – трех пассажиров.
Сообщения о действиях выведи в консоль.
 Создай классы и несколько объектов. Вызови их методы, «перевезя» таким образом 6 человек и 2 тонны груза. */