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
    // Appends a new value to the end of our arrayList
    arrayList.add("Steve")
    // Adds a new value at the selected position within our arrayyList
    arrayList.add(1, "Bob")

    println(arrayList)

    val removed = arrayList.remove("Michael")
    // Michael is no longer displayed within our arrayList
    println(arrayList)
    // Returns true because Michael was removed
    println(removed)

    // Specifying where our subList will begin and end, it is not inclusive.. that means the item at position [3] will not be included in our subList
    // A good way to know how many items will return in your subList is 3 - 1 = 2, so 2 items will be in our new array.
    val subListArray = arrayList.subList(1, 3)
    println(subListArray)
}