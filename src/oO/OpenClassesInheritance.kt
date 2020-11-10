package oO

// Inheritance is a concept that refers to classes, we can have a class inherit from another class,
// when we do this our new class inherits all the properties and methods from the parent class.

// The open keyword allows us to inherit from this class as well as override them.
open class PersonFour(open val name: String, open var age: Int) {
    init {
        println("Creating new person")
    }

    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

    fun getYearOfBirth() = 2020 - age
}

// The problem we're trying to solve here is creating the same parameters and methods over and over again.
// The override keyword goes with the open keyword above and allows us to push the changes we make to our person back up.
// If for some reason we didn't need to make a change to one of the parameters we could just not use the open/override key words,
// We would then however need to pass this value in, instead of the parameter.
class Student(override val name: String, override var age: Int, val studentId: Long): PersonFour(name, age) {
    // This method is only available to Student objects.
    fun isIntelligent() = true
}

class Employee(override val name: String, override var age: Int): PersonFour(name, age) {
    // This method is only available to Employee objects.
    fun receivedPayment() {
        println("Payment received")
    }
}

fun main() {
    val student = Student("Michael", 32, 123413471)
    println(student.age)
    student.speak()

    val employee = Employee("Bob", 12)
    println(employee.getYearOfBirth())

    employee.receivedPayment()
}