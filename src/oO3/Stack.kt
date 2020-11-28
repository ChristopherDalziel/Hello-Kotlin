package oO3

// A stack is a common pattern in Kotlin - In a stack you can only remove a value from the top or bottom of the stack not from the middle etc.
// <E> is an element type, so in this example we're having a Stack OF an ELEMENT. This is because our push/pop methods are not dependent on a certain element type.
// Stack <E> is what makes our class Generic and repeatable.
class Stack<E> {

    fun push() {
        val array = arrayOf(1, 2, 3)
    }

    fun pop() {

    }
}
