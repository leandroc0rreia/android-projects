package Directions

class Directions {

    enum class Directions{
        NORTH,SOUTH,EAST,WEST,START,END
    }

    class Game (var path: MutableList<Directions> = mutableListOf(Directions.START)){
        val north = { path.add(Directions.NORTH) }
        val south = {path.add(Directions.SOUTH)}
        val east = {path.add(Directions.EAST)}
        val west = {path.add(Directions.WEST)}
        val end = {
            path.add(Directions.END)
            println("Game Over: $path")
        }
    }
}