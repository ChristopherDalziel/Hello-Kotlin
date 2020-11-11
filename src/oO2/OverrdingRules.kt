package oO2

// When you don't abstract or open a class/methods, they are by default final, if you're abstracting/opening them you do need to set final to prevent this.

abstract class Course(val topic: String, val price: Double) {
    open fun learn() {
        println("Learning a $topic course")
    }
}

interface Learnable {
    fun learn() {
        println("Learning...")
    }
}

// If you have a method that is a child of separate classes/interfaces like we do in the KotlinCourse class, it will have to be overwritten, to make clear what implementation is supposed to be used.
open class KotlinCourse: Course("Kotlin", 999.99), Learnable {
    // The final keyword prevents other child classes from making an override change to the same method
    final override fun learn() {
        // If for some reason we wanted to return the value from the parent class without reimplementing it here we can do it using 'super', super always refers to the parent class.
        // If as we do here, .learn comes from multiple parents, we need to use the angle brackets <> to specify what parent we want it to be returned from.
        super<Learnable>.learn()
        println("I'm one of the first people to learn Kotlin :)")
    }
}

class SpecialKotlinClass: KotlinCourse() {
    // We can't override the learn method here as it was made final in the previous child class
    // override fun learn() {
    //    println("Learning special Kotlin course.")
    // }
}

fun main() {
    val course = KotlinCourse()
    course.learn()
}