package Tutorial

class Spice(name: String = "curry",spiciness: String = "mild"){

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
}