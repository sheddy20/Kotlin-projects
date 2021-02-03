fun main() {
    val numberOfFish = 67
    val numberOfPlants = 20
    println("i have $numberOfFish number of fish and $numberOfPlants plants")
    println("i have ${numberOfFish + numberOfPlants} fish and plants")
    myValue()
}

fun myValue(){
    val numberOfFish = 50
    if (numberOfFish in 1..100){
        println(numberOfFish)
    } else {
        println("Number not in the range of fish")
    }

    val userName = "Dane Mackier"
    when(userName){
        "Alexis" -> println("Try Again")
        "Mulligan" -> println("Wrong Username")
        "Julia" -> println("Last Attempt")
        else -> println("No username matches")
    }

    val welcomeMessage = "Hello and welcome to kotlin"
    when(welcomeMessage.length){
        0 -> println("Nothing to say")
        in 1..50 -> println("Perfect Timing")
        else -> println("Too long")
    }
}

