fun main() {
    val name = "Provide Your City Name? "
    print(name)
    val cityName = readLine()
    val defaultCountry = "Australia"
    when(cityName){
        "Australia" -> println("This is: $defaultCountry")
        "Sydney" -> println("$cityName is in: $defaultCountry")
        "Melbourne" -> println("$cityName is part of: $defaultCountry")
        "Perth" -> println("$cityName is part of: $defaultCountry")
        "Canberra" -> println("$cityName is part of: $defaultCountry")
        "Adelaide" -> println("$cityName is part of: $defaultCountry")
        else -> println("The City is not part of: $defaultCountry")
    }
}