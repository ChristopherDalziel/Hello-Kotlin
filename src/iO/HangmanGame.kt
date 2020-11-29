package iO

fun main() {

    // Begin game
    print("Enter the word to guess: ")
    val word = readLine()

    // If the user doesn't enter a word end the game
    if(word == null) {
        println("No word was entered, GAME OVER.")
        return
    }

    // Hides the word from the player by moving it out of view
    for( i in 1..100) {
        println()
    }

    // Normalization of the word to letters and conversion to an array - by converting this array to a set we're removing any duplicates
    val letters = word.toLowerCase().toCharArray().toHashSet()

    // Users correct guesses a mutable list can have new items added and removed from it
    val correctGuesses = mutableListOf<Char>()


    // Wrong guesses
    val fails = 0

    // What do we do while the user hasn't guessed the complete word
    while (letters != correctGuesses) {
        // Print the word that has been guessed so far

    }

    println("#Wrong guesses: $fails\n\n")
    println("..Well done!")

    printExploredWord("Hello", mutableSetOf('L'))
}


fun printExploredWord(word: String, correctGuesses: Set<Char>) {
    for(character in word.toLowerCase()) {
        if(correctGuesses.contains(character)) {
            print("$character ")
        } else {
            print("_ ")
        }
    }
}
