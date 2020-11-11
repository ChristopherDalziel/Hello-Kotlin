package oO2

class Book(val title: String, val author: String, val publicationYear: Int, var price: Double) {
    // If for some reason, in our application we only wanted this class to hold these properties, to pass down to child classes.
    // This would be the perfect example for a DataClass.

    // To achieve the same output we did from the data class below we would need to do the following
    override fun toString(): String {
        return "Book[title=$title, author=$author, publicationYear=$publicationYear, price=$price"
    }
}

data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double) {
    // We can still create methods within a data class if we want
}

fun main() {
    val book = Book("Super Book", "John Doe", 2000, 50.11)
    val book2 = Book("Super Book", "John Doe", 2000, 50.11)
    val dataBook = DataBook("Super Book", "John Doe", 2000, 50.11)
    val dataBook2 = DataBook("Super Book", "John Doe", 2000, 50.11)
    // Data classes have a really useful copy method that allow us to change a single parameter with ease
    val dataBook3 = dataBook.copy(price = 30.55)
    // Data classes make for easy destructuring.
    val (title, author, price) = dataBook3
    // Hashing, hash sets and methods
    // In a set you cannot have duplicates, so if we print this it will return a set with only two elements, another pro of data classes.
    val set = hashSetOf(dataBook, dataBook2, dataBook3)

    // The normal class will print out the package we're in, the name of the class and then the memory usage number.
    println(book)
    // The data class prints out the name of the class and each of the property names and their values, this is done via a toString method.
    println(dataBook)
    // The values returned from the non-date classes are NOT the same even when provided the same values
    println(dataBook == dataBook2)
    println(book == book2)
    println(dataBook3)
    println(title + author + price)
}