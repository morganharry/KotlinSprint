package lesson_2

import kotlin.math.*

fun main() {
    var deposit = 70_000.00
    val rateDeposit = 16.7 / 100
    val termDeposit = 20

    deposit = deposit * (1.0 + rateDeposit).pow(termDeposit)
    println(String.format("%.3f", deposit))
}
