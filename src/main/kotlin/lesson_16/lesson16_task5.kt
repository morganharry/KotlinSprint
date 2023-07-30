package lesson_16

const val MAX_RECOVERY_HEALTH = 10

class Player(val name: String, private var health: Int, var power: Int) {

    fun getInfo(): String {
        return ("$name ($health;$power)")
    }

    fun getHealth(): Int {
        return health
    }

    fun kick(): Int {
        val powerOfKick = (-(power)..0).random()
        println(powerOfKick)
        return powerOfKick
    }

    fun recovery(): Int {
        val healthOfRecovery = (0..MAX_RECOVERY_HEALTH).random()
        println("Соперник немного отдышался: +$healthOfRecovery")
        return healthOfRecovery
    }

    fun changeHealth(_health: Int) {
        health += _health
        if (health <= 0) death()
        else recovery()
    }

    fun death() {
        health = 0
        power = 0
        println("$name падает на ринг и не может встать!")
    }
}

fun main() {
    val player1 = Player("Рокки Бальбоа", ((100..120).random()), ((20..40).random()))
    val player2 = Player("Аполло Крид", ((100..120).random()), ((20..40).random()))
    fight(player1, player2)
}

fun fight(player1: Player, player2: Player) {
    println("Сегодня на ринге встречаются: ${player1.getInfo()} и ${player2.getInfo()}.")
    comparePower(player1, player2)
    compareHealth(player1, player2)
    println("Бой начался!")
    var count = 0
    do {
        count++
        print("$count - ")
        if ((0..1).random() == 0) {
            print("Удар наносит ${player1.name}: ")
            player2.changeHealth(player1.kick())
            if (player2.getHealth() == 0) {
                println("Бой закончен! Победа за ${player1.name}.")
                break
            }
        } else {
            print("Удар наносит ${player2.name}: ")
            player1.changeHealth(player2.kick())
            if (player1.getHealth() == 0) {
                println("Бой закончен! Победа за ${player2.name}.")
                break
            }
        }
        compareHealth(player1, player2)
    } while (true)
}

fun compareHealth(player1: Player, player2: Player) {
    if (player1.getHealth() == player2.getHealth()) println("У бойцов одинаковый запас здоровья!")
    else {
        val moreHealthyPlayer = if (player1.getHealth() > player2.getHealth()) player1.name else player2.name
        println("У $moreHealthyPlayer лучше запас здоровья.")
    }
    if (player1.getHealth() <= player2.power) println("${player1.name} с трудом стоит на ногах!")
    if (player2.getHealth() <= player1.power) println("${player1.name} держится из последних сил!")
}

fun comparePower(player1: Player, player2: Player) {
    if (player1.power == player2.power) println("Бой будет между равными по силе соперниками!")
    else {
        val moreStrongPlayer = if (player1.power > player2.power) player1.name else player2.name
        println("$moreStrongPlayer - более сильный и опытный боец.")
    }
}