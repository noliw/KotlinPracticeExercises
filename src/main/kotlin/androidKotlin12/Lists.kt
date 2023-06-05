package androidKotlin12

/* ->Lists are ordered collections of elements, meaning the elements have a specific order or sequence.
    -> Elements in a list can be accessed and retrieved using their index or position.
    -> Lists allow duplicate elements, which means you can have multiple occurrences of the same element in a list.
    -> Lists are represented by classes like ArrayList or LinkedList in Kotlin.
    -> Lists are typically used when you need to maintain the order of elements or when duplicates are allowed.*/


fun main() {
    val months = listOf("Jan", "Oct", "Mar")

//    println(months[2])
    for (month in months){
        println(month)
    }

}