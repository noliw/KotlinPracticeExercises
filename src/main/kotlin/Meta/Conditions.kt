package Meta

fun main() {
    val weekday = "Friday"
    val hour = 35
    println("On $weekday, the opening hours are:")

    when (weekday) {
        "Monday" -> println("8 AM to 12 PM (8:00 - 12:00)")
        "Tuesday" -> println("8 AM to 6 PM (8:00 - 18:00)")
        "Wednesday" -> println("8 AM to 6 PM (8:00 - 18:00)")
        "Thursday" -> println("8 AM to 6 PM (8:00 - 18:00)")
        "Friday" -> println("8 AM to 9 PM (8:00 - 21:00)")
        "Saturday" -> println("9 AM to 4 PM (9:00 - 16:00)")
        "Sunday" -> println("8 AM to 4 PM (8:00 - 16:00)")
    }

    val isOpen = when (weekday){
        "Monday" -> hour in 8..12
        "Tuesday" -> hour in 8..18
        "Wednesday" -> hour in 8..18
        "Thursday" -> hour in 8..18
        "Friday" -> hour in 8..21
        "Saturday" -> hour in 9..16
        "Sunday" -> hour in 8..16
        else -> false
    }

    if (isOpen == true) println("Little Lemon is open now") else println("Little Lemon is closed now")
}