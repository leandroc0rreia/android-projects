package Book

fun main(args: Array<String>) {
    val book = Book("In Search of Lost Time", "Marcel Proust", 1913)
    val bookTriple = book.getTitleAutorYear();
    println("There it is the ${bookTriple.first}, writen by ${bookTriple.second} in ${bookTriple.third}.")
}