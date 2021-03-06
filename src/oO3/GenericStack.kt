package oO3

// DRY = Don't repeat yourself

// Generics = Is a DRY solution of making generic classes/functions

// A stack is a common pattern in Kotlin - In a stack you can only remove a value from the top or bottom of the stack not from the middle etc.
// <E> is an element type, so in this example we're having a Stack OF an ELEMENT. This is because our push/pop methods are not dependent on a certain element type.
// Stack <E> is what makes our class Generic and repeatable.
// vararg = variable number of arguments

// Generic class
class Stack<E>(vararg val items: E) {

    // Returns the vararg items as a list
    val elements = items.toMutableList()

    fun push(element: E) {
        elements.add(element)
    }

    fun pop(): E? {
        if(!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}

// Generic function
fun <T>stackOf(vararg  elements: T) : Stack<T> {
    // * operator destructors our elements from an array
    return Stack(*elements)
}

fun main() {
    val stack = Stack(3, 5, 2, 8)
    val stack2 = stackOf("hi", "hello", "hey")

    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())

    for(i in 1..3) {
        println(stack2.pop())
    }
}