import java.util.*

internal abstract class Book(var title: String, var author: String) {
    internal abstract fun display()
}

internal class MyBook(
        title: String,
        author: String,
        var price: Int)
    : Book(title, author) {

    override fun display() {
        println("Title: $title")
        println("Author: $author")
        println("Price: $price")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val title = scanner.nextLine()
    val author = scanner.nextLine()
    val price = scanner.nextInt()
    scanner.close()

    val book = MyBook(title, author, price)
    book.display()
}