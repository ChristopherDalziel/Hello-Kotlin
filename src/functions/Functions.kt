package functions

import java.util.*

// Define helloWorld function, no parameters no return value
fun helloWorld(){
    println("Hello World!")
}

// Create a function that takes in a word and returns it separated by spaces. Kotlin -> K o t l i n
// Takes in one parameter has no return value
fun printWithSpaces(text: String) {
    for(char in text) {
        print("$char ")
    }
}

// No parameters returns a value
fun getCurrentDate(): Date {
    return Date()
}

// Two parameters returns a value
fun max(a: Int, b: Int): Int {
    // We can return before our if statement and then we do not have to return between each statement
    return if (a >= b) {
         a
    } else {
         b
    }
}

fun main() {
    // Calling our functions within main function
    helloWorld()
    printWithSpaces("Kotlin")
    println(getCurrentDate())
    println(max(17, 42))
}
