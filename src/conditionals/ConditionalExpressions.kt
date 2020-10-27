package conditionals

fun main() {
    val mode: Int = 2
    val result = when(mode) {
        1 -> "The mode is lazy"
        2 -> {
            // Everything is executed here however the expression value is the final line in the block
            println("So the mode is 2")
            val i: Int = 3
           "So the mode is busy"
        }
        3 -> "The mode is super-productive"
        else -> "I don't know that mode"
    }
    println(result)

    val x = if(mode <2) {
        println("Mode is less than 2")
        17
    } else {
       42
    }
    println(x)
}