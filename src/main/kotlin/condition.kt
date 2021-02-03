fun main() {
//    val enterEven = "Enter An Even Number: "
//    print(enterEven)
//    val evenNumber = Integer.valueOf(readLine())
//    if (evenNumber % 2 == 0){
//        print("$evenNumber is an even number")
//    } else {
//        println("$evenNumber is an odd number")
//    }
    checkMyScore()
    multipleCondition()
}

fun checkMyScore(){
    val inputScore = "Enter Any Number? "
    print(inputScore)
    val marks = Integer.valueOf(readLine())
    if (marks < 0){
        println("Negative Number")
        println("Check properly before compilation")
    } else {
        println("Positive Number")
        println("Welcome To Click Bank")
    }

}

fun multipleCondition(){
    val displayNumber:String = "Provide Any Number? "
    print(displayNumber)
    val num1 = Integer.valueOf(readLine())
    if (num1 < 0){
        println("Number is negative..")
    } else if (num1 > 0 && num1 < 10){
        println("Single Digit Number")
    } else if (num1 >= 10 && num1 <100){
        println("Double Digit....")
    } else {
        println("Number has 3 or more digit..")
    }
}