package Directions

fun main(args: Array<String>) {
    val game = Directions.Game()
    println("> ${game.path}")
    game.north.invoke()
    game.south.invoke()
    game.east.invoke()
    game.west.invoke()
    game.end.invoke()
}