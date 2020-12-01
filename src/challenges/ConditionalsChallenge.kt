package conditionals

import java.util.*

fun main() {
    val random = Random().nextInt(50) + 1
    when (random) {
        in 1..10 -> println("The random number is between 1 and 10 and it's value is $random")
        in 11..20 -> println("The random number is between 11 and 20 and it's value is $random")
        in 21..30 -> println("The random number is between 21 and 30 and it's value is $random")
        in 31..40 -> println("The random number is between 31 and 40 and it's value is $random")
        else -> println("The random number is above 40, it's $random")
    }
}

