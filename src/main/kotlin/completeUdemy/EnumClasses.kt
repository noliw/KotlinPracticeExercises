package completeUdemy


// Enum Classes are used when we want to represent a fixed set of values
// "Enum", short for "enumeration", is a unique kind of class in Kotlin that
// lets us define a fixed set of related constants.
fun main() {
    /* println(Direction.WEST) // Prints -> WEST */

    // looping through our enum values
    /* for (direction in Direction.values()){ // return an array of all elements in the enum
        println(direction)
    } */

//    println(Direction.NORTH.direction) // north
//    println(Direction.NORTH.distance) // 10
//    println(Direction.NORTH.name) // NORTH
//    println(Direction.NORTH.ordinal) // 0 is the index

    // Using functions
//    Direction.WEST.printData()


    val  direction = Direction.EAST

    when(direction) {
       Direction.EAST -> println("The direction is East")
        Direction.WEST -> println("The direction is West")
        Direction.NORTH -> println("The direction is North")
        Direction.SOUTH -> println("The direction is South")
    }
}


// the directions (NORTH, SOUTH, EAST, WEST) are instances/ objects created inside our enum class
enum class Direction (var direction: String, var distance: Int){
    NORTH("north", 10),
    SOUTH("south", 15),
    EAST("east", 20),
    WEST("west", 40);

    fun printData() {
        println("Direction is $direction and the Distance is $distance")
    }
}
