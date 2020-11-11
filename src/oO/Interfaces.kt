package oO

// Interfaces define a contract for our class
interface Driveable {
    // Each class that uses this interface must have a method called drive
    fun drive() {

    }
}

// We CANNOT have any state values within our interfaces, we can create them in the interface, but the values will be given in the class via override.
interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(val color: String): Driveable, Buildable {
    override val timeRequired = 120
    override fun drive() {
        println("Driving car..")
    }

    override fun build() {
        println("Built a shiny car")
    }
}

class Motorcycle(val color: String): Driveable {
    override fun drive() {
        println("Riding motorcycle..")
    }
}

fun main() {
    // Giving our new value the type of Drivable, now it can only access what is defined within the Drivable interface.
    val car: Driveable = Car("red")
    car.drive()

    // One of the benefits of using interfaces is we can make changes to the class component and the below will still work with the interface methods.
    val motorcycle: Driveable = Motorcycle("Pink")
    motorcycle.drive()
}