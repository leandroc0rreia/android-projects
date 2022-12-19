/*
package Spices
abstract class Spice(name: String = "curry",spiciness: String = "mild") {

    var name: String = name
    var spiciness: String = spiciness
    val heat: Int
        get(){
            return when(spiciness){
                "mild" -> 5
                else -> 0
            }
        }
    fun getNameAndSpicyLevel() = "${name} is lvl. ${heat}"
    abstract fun prepareSpice()

    interface Grinder{
        fun grind()
    }
    abstract class Curry(color: SpiceColor = YellowSpiceColor): Spice(),
        SpiceColor by color,
        Grinder{
        override fun prepareSpice() {

        }

        override fun grind() {

        }

    }

    enum class Color(val rgb: Int) {
        RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
    }
    interface SpiceColor{
        var color: Color
    }
    object YellowSpiceColor: SpiceColor{
        override var color: Color = "YELLOW(0xFFFF00)"
    }

    data class SpiceContainer(var spice: String){

    }
}

*/
