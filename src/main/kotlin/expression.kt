fun main() {
    val oneToFive = 1.rangeTo(5)
    for(one in oneToFive.reversed()){
        println(one)
    }
    val fourDownToeleven = 6.downTo(3)
    for(four in fourDownToeleven){
        println(four)
    }
//    val oneToFifty = 1..50
//    val oddNumber = oneToFifty.step(1)
//    for (odd in oddNumber){
//        println(odd)
//    }
}