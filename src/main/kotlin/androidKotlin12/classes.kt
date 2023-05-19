package androidKotlin12

fun main() {
    var nola = Person("noli", "Workineh")
    var john = Person()
}

class Person(firstName: String = "John", lastName: String = "Doe") {
    //Initializer Block
    init {
        println("Initialized a new person with firstName = $firstName & last name = $lastName")
    }
}