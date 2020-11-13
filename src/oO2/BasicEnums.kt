package oO2

import oO.Car
import oO.Driveable

//class Color {
//    public val RED = 1
//    public val BLUE = 2
//    public val GREEN = 4
//}

// If this was set up in a single file this workflow would work, the benefit of this now is we cannot make any spelling errors of BLUE etc as our app will fail compile.
//fun main() {
//    val car: Driveable = Car(Color().BLUE)
//}

// There are downsides tro not using the string values, we cannot out put the actual color, if we add them together we don't know what value could be returned.

// Enums is a better solution here:
enum class Color {
    RED, GREEN, BLUE
}

interface Driveable {
    fun drive() {

    }
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class NewCar(val color: Color): Driveable, Buildable {
    override val timeRequired = 120
    override fun drive() {
        println("Driving car..")
    }

    override fun build() {
        println("Built a shiny car")
    }
}

fun main() {
    // Using enums, also gives us the benefit of type safety
    // Also gives performance benefits of using numbers, but we can still print the information in a meaningful way if we need to.
    val car = NewCar(Color.GREEN)
    car.drive()
    // Prints the string "GREEN"
    println(car.color)

}