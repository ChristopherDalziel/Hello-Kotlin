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

///**
// * @author Peter Sommerhoff
// *
// * Solution for the coding challenge on object orientation inside the Udemy course.
// * Defines some simple interfaces and classes for a library inventory system.
// */
//interface Lendable {
//    fun borrow()
//}
//
//// The properties title, genre, and publicationYear can be included in the parent class because both books and DVDs
//// have these properties. The author and length properties however are included only in the child classes.
//abstract class InventoryItem(val title: String,
//                             val genre: String,
//                             var publicationYear: Int,
//                             var borrowed: Boolean) : Lendable {
//
//    override fun borrow() {
//        if (!borrowed) {
//            borrowed = true
//        } else {
//            println("This item is already borrowed.")
//        }
//    }
//
//    // If you want, you can also add a returnItem() method so that you can also un-borrow items.
//
//
//    override fun toString(): String {
//        return "InventoryItem(title='$title', genre='$genre', publicationYear=$publicationYear, borrowed=$borrowed)"
//    }
//
//    abstract fun copy(): InventoryItem
//
//}
//
//// A book will be not borrowed by default.
//// The class is called LibraryBook to prevent name clashes with previous challenges.
//class LibraryBook(title: String,
//                  val author: String,
//                  genre: String,
//                  publicationYear: Int) : InventoryItem(title, genre, publicationYear, false) {
//
//    fun read() {
//        println("Reading a book by $author...")
//    }
//
//    override fun copy(): InventoryItem {
//        val copy = LibraryBook(title, author, genre, publicationYear)
//        copy.borrowed = this.borrowed
//
//        return copy
//    }
//}
//
//// A DVD will also be not borrowed by default.
//class LibraryDVD(title: String,
//                 genre: String,
//                 val length: Int,
//                 publicationYear: Int) : InventoryItem(title, genre, publicationYear, false) {
//
//    fun watch() {
//        println("Watching $title...")
//    }
//
//    override fun copy(): InventoryItem {
//        val copy = LibraryDVD(title, genre, length, publicationYear)
//        copy.borrowed = this.borrowed
//
//        return copy
//    }
//}