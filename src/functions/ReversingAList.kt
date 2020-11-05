package functions

// CodeAlong to help with loops && Kotlin

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(reverse(numbers))
    println(reverseTwo(numbers))
}

// 1st - In this solution we have to worry more about our index's and then get the elements back to front

// This function takes in a list of ints, and outputs a list of ints
fun reverse(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    // - 1 because thats the last index inside of the list
    for (i in 0..list.size-1) {
        result.add(list.get(list.size-1-i))
    }
    return result
}

// 2nd - In this solution the downTo function makes our range what we actually want, our i goes from our last element down to our first element

fun reverseTwo(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in list.size - 1 downTo 0) {
        result.add(list.get(i))
    }
    return result
}