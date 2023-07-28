package lesson_15

interface Searching {
    fun search() {}
}

abstract class Goods(val name: String, val number: Int) {
}

class MusicalInstrument(
    name: String,
    number: Int,
    val listOfAccessories: MutableList<Accessor> = mutableListOf<Accessor>()
) : Goods(name, number), Searching {
    override fun search() {
        println("Для инстурмента $name у нас есть:")
        println(listOfAccessories.map { it.name }.joinToString(", "))
    }
}

class Accessor(name: String, number: Int, val instrument: MusicalInstrument) : Goods(name, number) {
}

fun main() {
    val musicalInstrument1 = MusicalInstrument("Электрогитара", 5)
    val musicalInstrument2 = MusicalInstrument("Ударная установка", 3)
    val musicalInstrument3 = MusicalInstrument("Микрофон", 10)
    var listOfInstruments = mutableListOf<MusicalInstrument>(musicalInstrument1, musicalInstrument2, musicalInstrument3)

    val accessor1 = Accessor("комплект струн", 20, musicalInstrument1)
    val accessor2 = Accessor("медиатор", 100, musicalInstrument1)
    val accessor3 = Accessor("барабанные палочки", 10, musicalInstrument2)
    val accessor4 = Accessor("микрофонная стойка", 2, musicalInstrument3)
    val accessor5 = Accessor("кейс для микрофона", 1, musicalInstrument3)
    var listOfAccessories = mutableListOf<Accessor>(accessor1, accessor2, accessor3, accessor4, accessor5)

    listOfInstruments = addAccessor(listOfAccessories, listOfInstruments)

    searchForUser(listOfInstruments)
}

fun addAccessor(
    listOfAccessories: MutableList<Accessor>,
    listOfInstruments: MutableList<MusicalInstrument>
): MutableList<MusicalInstrument> {
    for (instrument in listOfInstruments) {
        for (accessor in listOfAccessories)
            if (instrument == accessor.instrument)
                instrument.listOfAccessories.add(accessor)
    }
    return listOfInstruments
}

fun searchForUser(listOfInstruments: MutableList<MusicalInstrument>) {
    println("Для какого инструмента вы хотите найти аксессуар?")
    println("У нас есть: ${listOfInstruments.map { it.name }.joinToString(", ")}")
    val instrumentFromUser = readln()
    for (instrument in listOfInstruments)
        if (instrument.name == instrumentFromUser) instrument.search()
}

