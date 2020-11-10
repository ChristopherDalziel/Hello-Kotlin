package oO

// Default values are exactly what they sound like, when creating a new house if we do not pass in a parameter for price, it will default
private class House(val height: Double, val color: String, val price: Int = 5000) {
    fun print() {
        println("House [height=$height, color=$color, price=$price]")
    }
}

fun main() {
    // Named parameters help make our code more readable
    val house = House(height = 4.5, color = "Blue", price = 150000)
    // And also give us more flexibility to change the order with pass in the parameters
    val redHouse = House(color = "Red", price = 5, height = 4.2)
    // Using default value for price
    val fiveThousandDollarHouse = House(20.5, "pink")

    house.print()
    redHouse.print()
    fiveThousandDollarHouse.print()
}