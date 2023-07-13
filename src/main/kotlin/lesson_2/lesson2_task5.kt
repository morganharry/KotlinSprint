package lesson_2

import kotlin.math.*

fun main() {
    var deposit = 70_000.00
    val rateDeposit = 16.7 / 100
    val termDeposit = 20

    deposit = deposit * (1.0 + rateDeposit).pow(termDeposit)
    println(String.format("%.3f", deposit))
}

/*
println((deposit * 1000.0).roundToInt() / 1000.0)

ок, решение рабочее! однако, в данном случае, чтобы не заниматься лишними вычислениями,
 лучше посмотреть в сторону String.format() для нужного вывода количества знаков после запятой
 */