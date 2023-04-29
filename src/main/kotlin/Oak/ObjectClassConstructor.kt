package Oak

fun main(args: Array<String>) {

//    Creating an object from class
    /*
    var myFirstCar = Cars()
    myFirstCar.name = "Ferrari"
    myFirstCar.model = 2021

    var mySecondCar = Cars()
    mySecondCar.name = "Mercedes"
    mySecondCar.model = 2010


    println("My car's name is ${myFirstCar.name} and its model is ${myFirstCar.model}")
    println("-------------------------------------------------------------")
    println("My car's name is ${mySecondCar.name} and its model is ${mySecondCar.model}")
    */

//    using primary constructor
//    var myNewCar = MyCars(name = "Ferrari", model = 2021)
//    println("My car's name is ${myNewCar.name} and its model is ${myNewCar.model}")

// using secondary constructors
    var myThirdCar = MyThirdCar(name = "Jaguar", model = 2090)
    myThirdCar.name = "Nissan"
    myThirdCar.model = 2018
    println("My third car's name is ${myThirdCar.name} and its model is ${myThirdCar.model}")
}