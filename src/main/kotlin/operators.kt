fun main() {
    val rainBowColor: String? = null
    println(rainBowColor)

    var blackColor = "red"
    blackColor = "Blue"
    println(blackColor)
    aquariumCheck()
    twoVariables()
    listNull()
    myNullChecker()
}

fun aquariumCheck(){
    var aquarium = 2.plus(71).plus(233).minus(13).plus(30)
    println(aquarium)
}

fun twoVariables(){
    val greenColor:String? = "Green"
    println(greenColor)
    val blueColor:String? = "Blue"
    println(blueColor)
}

fun listNull(){
    val usersList: List<String?> = listOf(null, null)
    println(usersList)
    val userInt = listOf<Int?>(null, null, null)
    println(userInt)
    val userBool = listOf<Boolean?>(null, null, null)
    println(userBool)
    val userByte: List<Byte?> = listOf(null, null)
    println(userByte)
}

fun myNullChecker(){
    val age:Int? = 10
    if (age != null){
        println("users age is Increase to->: ONE")
    } else {
        println("Users age is down to-> 0")
    }
}