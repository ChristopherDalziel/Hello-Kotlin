package oO

// When we create parameters in our class like this we will no longer be able to use them in our functions below,
// We can however create properties below such as birthYear,
// The only other place besides these properties is in an init block. This defines what is supposed to happen when an object is created.
// We can also used the init block to access our passed in parameters, to do this we must use the this key word. The this keyword always refers to the object that it is apart of.
// HOWEVER, when using Kotlin we do not need to do this, we can do it all inline in the initial class creation when when we define our properties by adding val or var infront of them.
class PersonThree(val name: String, var age: Int) {
    init {
        println("New Person Created")
    }

    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2020 - age
}

fun main() {
    // In this lesson we're going to change the Name and Age of the person without first declaring it
    val person = PersonThree("Chris", 26)

    person.speak()
    person.greet("World")
    println(person.getYearOfBirth())

    // We can still access our properties the same as before
    println(person.name)
}