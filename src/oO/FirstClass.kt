package oO

class Person {
    var name: String = "Sarah"
    var age: Int = 30
}

fun main() {
    // Creating a new object from our class
    val person = Person()
    // Accessing our properties
    println(person.name)
    println(person.age)
    // Reassigning our name
    person.name = "Chris"
    println(person.name)
}
