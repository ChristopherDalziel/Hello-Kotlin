package loops

fun main() {
    // Break
    for ( c in "Python") {
        if (c == 'o') {
            break
        }
        // Prints every letter in the word Python until we reach 'o' and then breaks which exits our code completely
        print(c)
    }

    println()

    // Continue
    val list = listOf("Book", "Table", "Laptop")
    for (str in list) {
        if(!str.contains('o')) {
            continue
        }
        // This only prints the words with the letter 'o' in them, if a word doesn't contain a letter 'o' it is skipped during the loop
        println(str)
    }
}