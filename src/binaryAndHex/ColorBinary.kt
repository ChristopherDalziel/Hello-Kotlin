package binaryAndHex

enum class ColorBinary(val rgb: Int) {
    // When using an enum class if you want to add methods after enum instances with a ;
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);

    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }
}

fun main() {
    // 0..1 -> 10 = 0b2
    println(0b1010)
    println(0b00001010) // 10 with 8bits
    println(0b11111111) // 255 also = to 0xFF
    println(0b11111111 == 0xFF) // Returns evidence

    // Truth table of binary, 0 in Binary == false
    // 1 and 1 == 1 || true
    // 1 and 0 == 0 || false
    // 0 and 1 == 0 || false
    // 0 and 0 == 0 || false

    println(1 and 1 == 1) // Returns evidence

    // Does our color have RED in it?
    println(ColorBinary.RED.containsRed()) // true
    println(ColorBinary.BLUE.containsRed()) // false
    println(ColorBinary.GREEN.containsRed()) // false
    println(ColorBinary.YELLOW.containsRed()) // true
}