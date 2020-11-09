package oO

class PersonTwo {
    var name: String = "Steve"
    var age: Int = 22

    // Our first Method - Methods are basically functions within a class
    fun speak() {
        println("Hello")
    }

    // Method with an argument
    fun greet(name: String) {
        println("Hello $name!")
    }

    // Returning a value from our method - after our brace we define what type the return value will be
//    fun getYearOfBirth(): Int {
//        return 2016 - age
//    }

    // We can recreate the above method in a much easier way
    fun getYearOfBirth() = 2016 - age
}

fun main() {
    val person = PersonTwo()

    person.speak()
    person.greet("Chris")

    // Because this method doesn't print at all it only returns the Int value and that is why we must call println ourselves
    println(person.getYearOfBirth())
}