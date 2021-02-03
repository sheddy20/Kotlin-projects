fun main() {
    val myCars:List<String> = listOf("Toyota","Bugatti", "BMW")
    println(myCars)

    val anyType = listOf<Int>(34, 56, 78, 90, 34, 45)
    println(anyType)

    val myArrays = arrayOf("Mantock", "A", true, 34, 45.6, null)
    for(arr in myArrays){
        println(arr)
    }
    myItems()
}

fun myItems(){
    val myInt = listOf<Int>(4, 6, 8, 9,10, 12)
    for (integer in myInt){
        println(integer.plus(4))
    }
    val myFirst = myInt.first()
    println(myFirst)
    val myLast = myInt.last()
    println(myLast)
    myFunction()
}

fun myFunction(){
    val oddNumbers:List<Int> = listOf(1, 3, 5, 7, 9, 11, 13, 15)
    for (num in oddNumbers){
        println("${num.times(4)}")
    }
    val myIndexOf = oddNumbers.indexOf(5)
    println(myIndexOf)
}