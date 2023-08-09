package lesson_14

abstract class AstronomicalObject(
    val name: String,
    val habitable: Boolean = false,
    val atmosphere: Boolean = false,
    val water: Boolean = false,
    val landing: Boolean = false,
) {
    fun giveInfAboutObject(): String {
        val text =
            "Наименование: $name, обитаемая: $habitable, атмосфера: $atmosphere, вода: $water, пригодна для высадки: $landing."
        return (text)
    }
}

class Planet(
    name: String,
    habitable: Boolean = false,
    atmosphere: Boolean = false,
    water: Boolean = false,
    landing: Boolean = false,
    val listOfSatellites: MutableList<Satellite> = mutableListOf<Satellite>()
) : AstronomicalObject(name, habitable, atmosphere, water, landing) {
    fun showInfAboutPlanet() {
        println("Информация о планете.\n${giveInfAboutObject()}")
        println("Спутники $name: ${listOfSatellites.map { it.name }.joinToString(", ")}")
    }

    fun addSatellite(satellite: Satellite) {
        listOfSatellites.add(satellite)
    }
}

class Satellite(
    name: String,
    habitable: Boolean = false,
    atmosphere: Boolean = false,
    water: Boolean = false,
    landing: Boolean = false,
) : AstronomicalObject(name, habitable, atmosphere, water, landing) {
}

fun main() {
    val planet1 = Planet("Revolver", true, true, true, true)
    val satellite1 = Satellite("Nevermind", atmosphere = true, water = true)
    val satellite2 = Satellite("Imagine")

    planet1.addSatellite(satellite1)
    planet1.addSatellite(satellite2)

    planet1.showInfAboutPlanet()
}

/*
все супер, только комменты кода в продакшене лучше не оставлять) */
/*
Задача 4 к Уроку 14

В компьютерной игре существуют планеты. У некоторых из них есть спутники. Планеты и спутники могут быть обитаемыми,
могут иметь атмосферу, воду, могут быть пригодными для высадки. Создай родительский класс, описывающий небесные тела,
 и подклассы, описывающие планеты и спутники.
Затем создай планету с двумя спутниками и выведи в консоль имя планеты и имена всех спутников. */