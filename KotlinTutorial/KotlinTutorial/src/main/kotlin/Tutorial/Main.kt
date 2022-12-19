package Tutorial

import java.util.Calendar

fun main(args: Array<String>) {

}

fun whatShouldIDoToday(mood: String, weather: String = isSunny(), temperature: Int = 24): String {
    return when{
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read."
    }
}

fun isSunny() = "Sunny"

fun canAddFish(tankSize: Double, listFish: List<Int>, fishSize: Int = 2, hasDecoration: Boolean = true): Boolean{
    return if (hasDecoration) tankSize >= 1.2*(listFish.sum()+fishSize) else tankSize <= listFish.sum()+fishSize
}

fun getFortuneCookie(){
    var fortune = "Fortune Cookie"
    while (fortune.contains("Take it easy")) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
    }
}

fun getBirthday(): Int{
    print("Enter your birthday: ")
    return readln().toIntOrNull() ?: 1
}

fun getFortune(data: Int): String {
    val listFortune = listOf("You will have a great day!","Things will go well for you today.","Enjoy a wonderful day of success.","Be humble and all will turn out well.","Today is a good day for exercising restraint.","Take it easy and enjoy life!","Treasure your friends because they are your greatest fortune.")
    //return
    return when(data){
        20 -> "Tomorrow you will have 10000000000€"
        else -> listFortune[data%listFortune.size]
    }
}

fun dayOfWeek() {
    println("What day is it today?")
    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
        2 -> println("domingo")
        3 -> println("segunda")
        4 -> println("quarta")
        5 -> println("quinta")
        6 -> println("sexta")
        7 -> println("sabado")
        else -> println("nao sei")
    }
}

fun greetings(time: String){
    val time = if (time.toInt()<12) println("Good morning, Leandro") else println("Good night, Leandro")
    println("Good ${time}, Kotlin")
    //if (horaActual<12) println("Good Morning, Leandro") else println("Good night, Leandro")
}

