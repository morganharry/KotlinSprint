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


/*
Задача 2 к Уроку 2

В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии, который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.
 */