package oO3

class Animal {
    // In Kotlin this is a property, in Java this is a field
    // Defining a property also creates getters and setters
    var age: Int = 0
    get() = field
    set(value) {
        if(value >= 0) {
            field = value
        }
    }

    // Val properties cannot have a setter
    val name = ""
    get() = field
}

fun main() {
    val animal = Animal()
    // Calling the setter
    animal.age = 8
    // This will not work due to our custom setter override
    animal.age = -2
    // Calling the getter
    println(animal.age)
}