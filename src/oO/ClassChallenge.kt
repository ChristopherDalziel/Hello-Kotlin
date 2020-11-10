package oO

private class Book(val title: String, val author: String, val publicationYear: Int, var borrowed: Boolean) {
    init {
        println("Creating a new book!")
    }

    fun isBookBorrowed(): Boolean {
        return borrowed
    }

    fun displayBookInfo() {
        println("$title written by $author, was published in $publicationYear.")
    }

    fun borrow(): Boolean {
        return if(!borrowed) {
            println("You have now borrowed this book")
            borrowed = true
            true
        } else {
            println("This book has already been borrowed")
            false
        }
    }

    fun returnBook(): Boolean {
        return if(!borrowed) {
            println("This book has not been borrowed")
            false
        } else {
            println("Thanks for returning this book")
            borrowed = false
            false
        }

    }

}

fun main() {
    val book = Book("Harry Potter and the Half Blood Prince", "J.K. Rowling", 2006, false)

    println(book.displayBookInfo())
    println(book.isBookBorrowed())
    book.borrow()
    book.borrow()
    book.returnBook()
}