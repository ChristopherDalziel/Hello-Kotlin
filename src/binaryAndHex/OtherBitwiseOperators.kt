package binaryAndHex

enum class ColorBitwise(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);

    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }

    // AND
    // 0 and 0 = 0
    // 1 and 0 = 1

    // OR
    // 0 or 0 = 1
    // 1 or 1 = 1

    // XOR
    // 0 xor 0 = 1
    // 1 xor 1 = 0
}

fun main() {
    // or
    // 1101
    // 1000
    // 1101
    println(0b1101 or 0b1000)
    // xor
    // 1101
    // 1000
    // 0101
    println(0b1101 xor 0b1000)
    // inverse
    // 0b10011.inv() == 0b...01100
    println(0b10011.inv() and 0x000001F) // 0b01100
}