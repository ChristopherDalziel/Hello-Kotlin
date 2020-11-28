package iO

import java.util.*

fun main() {
    val number = Random().nextInt(100) + 1
    var input: String?
    var guess = - 1

    while(guess != number) {
        // output
        print("Guess a number between 1 and 100: ")
        // input
        input = readLine()

        if(input != null) {
            // Can throw a NumberFormatException
            guess = input.toInt()
        }
        if(guess < number) {
            println("Your guess is too low")
        } else if(guess > number) {
            println("Your guess is too high")
        } else {
            println("You guessed correctly, you've won!")
        }
    }
}