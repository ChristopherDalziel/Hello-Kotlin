package noviceChallenge

fun main() {
    var myBookArray = arrayOf("Harry Potter", "Twilight", "Batman: HUSH")

    for (str in myBookArray) {
        if(str.contains('e')) {
            for (char in str) {
                println(char)
            }
        }
        // This line provides breaks
        println()
    }
}