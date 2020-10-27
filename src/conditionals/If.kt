package conditionals

fun main() {
    val age: Int = 20
    if (age < 18) {
        println("You cannot register")
    } else if ( age < 21 ) {
        println("Well maybe you can register")
    } else {
        println("You can register")
    }
}