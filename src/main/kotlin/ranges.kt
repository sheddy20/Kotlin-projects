fun main() {
    for(num in 1..10){
        println("Hello World-> $num")
    }

    val limitChecker = 1..20
    val inLimit = "20 in checker: ${21 in limitChecker}"
    println(inLimit)

    val enterAccountNumber = "Type Your Acct Number: "
    print(enterAccountNumber)
    val acctNumber = Integer.valueOf(readLine())
    when(acctNumber){
        0 -> println("Acct Number must be 10 digit")
        in 1..10 -> println("Please Select Your Bank")
        else -> println("Terminate Program")
    }
}