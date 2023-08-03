package lesson_18

const val NUM_DUPLICATE_RECTANGLE = 2
const val NUM_DUPLICATE_CUBE = 6

abstract class Package() {
    abstract fun getSquarePackage()
}

class PackageCube(val sizeA: Int) : Package() {
    override fun getSquarePackage() {
        val square = NUM_DUPLICATE_CUBE * sizeA * sizeA
        println("Площадь поверхности посылки: $square")
    }
}

class PackageRectangular(val sizeA: Int, val sizeB: Int, val sizeC: Int) : Package() {
    override fun getSquarePackage() {
        val square = NUM_DUPLICATE_RECTANGLE * (sizeA * sizeB + sizeA * sizeC + sizeB * sizeC)
        println("Площадь поверхности посылки: $square")
    }
}

fun main() {
    val package1: Package = PackageRectangular(1, 1, 2)
    val package2: Package = PackageCube(1)

    val listOfPackage = listOf<Package>(package1, package2)

    listOfPackage.forEach {
        it.getSquarePackage()
    }
}