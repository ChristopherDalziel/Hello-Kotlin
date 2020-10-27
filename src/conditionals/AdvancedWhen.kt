package conditionals

fun main() {
    val x = 10
    when(x) {
        5 -> println("x is 5")
        3*12 -> println("x is 3*12")
        "Hey there".length -> println("x is the length of the string 'Hey there'")
        in 1..10 -> println("x is between 1 and 10")
        !in 1..9 -> println("x is not between 1 and 9")
    }
}