package loops

fun main() {
    // I will become our iterator increasing each loop
    for (i in 1..10) {
        print(i)
    }

    var sum = 0
    for (i in 1..10) {
        sum = sum + 1
        println(sum)
    }

    val list = listOf("Java", "Kotlin", "Ruby", "JavaScript")
    // The element variable we use within our for loop will be assigned each value in the array as we loop
    for (element in list) {
        println(element)
    }

    // Here we can loop and return both the index and the value
    for ((index, value) in list.withIndex()) {
        println("Element at $index is $value")
    }
}