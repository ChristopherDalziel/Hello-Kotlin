package collections

fun main() {
    // Arrays have a fixed length
    val array = arrayOf("QLD", "NSW", "VIC")
    val newArray = arrayOf("TAS", "WA")
    // Combine two arrays together
    val combinedArray = array + newArray

    // Methods
    println(array.size)
    val empty: Boolean = array.isEmpty()
    if (array.contains("NT")) {
        println("It contains NT")
    } else {
        println("It does not contain NT")
    }

    // Lists are immutable
    val list = listOf("Orange", "Apple", "Bananas")

    val arrayList = arrayListOf("Patrick", "Michael", "Sarah")
}