package androidKotlin12

// Allow us to store multiple pieces of data in one variable

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)

    println(numbers) // This prints the adress in memory of the variable [Ljava.lang.Integer;@4f3f5b24
    println(numbers.contentToString())

    println("------------------------------------------------------")

    // Iterating over array simplest way is the for loop
    for (number in numbers) {
        println(number + 2)
    }
    println("------------------------------------------------------")

    // accessing elements in an array
    println(numbers[4])

    println("------------------------------------------------------")
    // Updating elements in an array
    numbers[4] = 2
    println(numbers.contentToString())


    println("------------------------------------------------------")
    val fruits = arrayOf(Fruit("Apple", 2.5))
    println("The ${fruits[0].name} is $${fruits[0].price}.")
}


data class Fruit(val name: String, val price: Double)