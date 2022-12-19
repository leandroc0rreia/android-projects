package Book
class Book(var title: String,var autor: String, var year: Int) {

    var allBooks: Set<String> = setOf("Works [37 plays, 6 poems, sonnets]","The Tragedy of Macbeth", "The Tragedy of Hamlet, Prince of", "The Tempest")
    var library: Map<String, String> = mapOf()
    fun getTitleAutor(): Pair<String, String>{
        return Pair(title,autor)
    }

    fun getTitleAutorYear(): Triple<String, String, Int>{
        return Triple(title, autor, year)
    }


}