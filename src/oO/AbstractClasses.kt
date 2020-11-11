package oO

// When we made this class Open in the previous lesson, we created a situation where would use an Abstract class instead of an open class.
// The person class is currently open, this means we can still create objects from it.
// In some cases you may not want this, you may only use the Person class to pass methods and parameters, and prevent it from creating objects.
// This is what the abstract key word does, now in the file below, we can only create Student and Employee objects.
abstract class PersonFive(open val name: String, open var age: Int) {
    // Abstracting a method within a parent class means it's defined here, but implemented within the child class.
    abstract fun speak()

    fun greet(name: String) {
        println("Hello $name")
    }

    fun getYearOfBirth() = 2020 - age
}

class StudentFive(override val name: String, override var age: Int, val studentId: Long): PersonFive(name, age) {
    fun isIntelligent() = true

    override fun speak() {
        println("Hi there, I am a student!")
    }
}

class EmployeeFive(override val name: String, override var age: Int): PersonFive(name, age) {
    fun receivedPayment() {
        println("Payment received")
    }

    override fun speak() {
        println("Hi, I am an employee here")
    }
}

fun main() {
    val student = StudentFive("Michael", 32, 123413471)
    println(student.age)
    student.speak()

    val employee = EmployeeFive("Bob", 12)
    println(employee.getYearOfBirth())
    employee.speak()

    employee.receivedPayment()
}