package loops

// Write a program that calculates the sum of all numbers from 100 - 100,000 and prints the result
// Don't forget about TYPES.. I initially got the wrong result because I returned an INT instead of a LONG

fun main() {
    var sum = 0L
    for(i in 100..100000L) {
        sum += i
    }
    println(sum)
}