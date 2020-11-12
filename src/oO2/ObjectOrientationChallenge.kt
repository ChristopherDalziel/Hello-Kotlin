package oO2

interface Lendable {
    fun borrow()
}

abstract class InventoryItem(open val title: String, open val genre: String, open val publicationYear: Int, open var borrowed: Boolean = false): Lendable {
    override fun borrow() {
        if(!borrowed) {
            println("You can borrow this item")
        } else {
            println("Sorry this item has already been borrowed")
        }
    }

}

class Book1(override val title: String, override val genre: String, override val publicationYear: Int, override var borrowed: Boolean, val author: String): InventoryItem(title, genre, publicationYear, borrowed) {

}

class Dvd(override val title: String, override val genre: String, override val publicationYear: Int, override var borrowed: Boolean, val length: Int): InventoryItem(title, genre, publicationYear, borrowed) {

}

fun main() {
    val book = Book1("Harry Potter", "Fiction", 2001, false, "JK Rowling")
    val dvd = Dvd("Jurassic Park", "Action", 1997, true, 1000)

    println(book.borrow())
    println(dvd.borrow())
}