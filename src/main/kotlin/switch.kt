fun main() {
    val fish = "trout"
    println("i like to eat $fish fishes")
    val fish1 = "hardock"
    println("i dont like $fish1 fish")
    val fish2 = "snapper"
    println("i rarely eat the $fish2 fish")
    checkLength()
}

fun checkLength(){
    val fish = "fishName"
    when(fish.length){
        0 -> println("Thats an error")
        in 3..12 -> println("Good fish name")
        else -> println("OK fish name")
    }
}