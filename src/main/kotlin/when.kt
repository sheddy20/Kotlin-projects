fun main() {
    val number = "provide a number? "
    print(number)
    val ranges = Integer.valueOf(readLine())
    when(ranges){
        in 1..9 -> println("$ranges is a single digit number")
        in 100..300 -> println("$ranges is three digit number")
        in 10..99 -> println("$ranges is double digit number")
        else -> println("$ranges has more than three digit number")
    }
}