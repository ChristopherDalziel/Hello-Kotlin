package iO

import java.io.File

fun main() {
    // Create object of the file class
    File("src/inputfile.txt").forEachLine {
        // 'it' refers to each line returned from the file
        println(it)
    }
}