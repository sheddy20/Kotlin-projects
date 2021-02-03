fun main() {
    val displayBankName:String = "Welcome To Universal Bank: "
    println(displayBankName)
    doBankTransactions()
}

fun doBankTransactions(){
    val inputYourPin = "Please Enter Your Pin: "
    print(inputYourPin)

    val pin = Integer.valueOf(readLine())
    if (pin == 1990){
        println("Select Your Bank: ")
        val availableBanks = listOf<String>("Union Bank", "Zenith Bank", "Wema Bank")
        for (banks in availableBanks){
            println(banks)
        }
    } else if (pin != 1990){
        println("Wrong Digit Pin")
    } else {
        println("Transaction Terminated")
    }
}