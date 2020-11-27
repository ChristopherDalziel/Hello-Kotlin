package oO3

open class AnimalTwo {
    // Now it's private we can ONLY use the age class within this animal class
    private var age: Int = 0
    // Protected is only used within an 'OPEN' class - Protected properties/methods can be accessed by children classes
    protected var name ="Sam"
    // Internal means you can use these properties/methods can be accessed by any class/function within the module
    internal val isDangerous = true
    // Public is not strict at all it can be accessed from anywhere - this is what we want users of our class to use/call

    // Able to use the age perimeter here as it's within our class
    public fun isOld(): Boolean {
        return age > 12
    }
}

class Vertebrate : Animal() {
    // Can access name from the Animal class
    fun introduceYourself() {
        println(name)
    }
}

fun main() {
    val animal = AnimalTwo()
    // We can no longer access the age in the main function as it's private to the above class
    // animal.age()
    // No access to protected parameters/methods
    // animal.name()
}

// Private is generally used unless we want the outside world to be able to make changes to our setters and getters within our classes