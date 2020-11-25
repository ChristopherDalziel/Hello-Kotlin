package binaryAndHex

// This wasn't possible in our previous enum class, but here we can use enums in combination with hexadecimal numbers to display colors.
enum class ColorHex(rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00)
}

fun main() {
    // 0..9 -> 1234 (decimal)
    // 0..9, A, B, C, D, E, F -> 0x10
    println(0x10) // 16
    println(0x1F) // 31
    println(0xFF) // 255
    println(0xCAFE) // 51966

    println(0x000000) // black
    println(0xFFFFFF) // white
    // RGB -> Red Green Blue
    println(0xFF0000) // red
    println(0x00FF00) // green
    println(0x0000FF) // blue
}