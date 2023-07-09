package lesson_2

fun main() {
    val numOfEmployees = 50
    val salaryOfEmployees = 30_000
    val numOfInterns = 30
    val salaryOfInterns = 20_000

    val sumSalaryOfEmployees = numOfEmployees * salaryOfEmployees
    val sumSalaryOfAll = sumSalaryOfEmployees + numOfInterns * salaryOfInterns
    val averageSalaryOfAll = sumSalaryOfAll / (numOfEmployees + numOfInterns)

    println (sumSalaryOfEmployees)
    println (sumSalaryOfAll)
    println (averageSalaryOfAll)
}
