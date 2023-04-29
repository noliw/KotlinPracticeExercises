package Oak

fun main(args: Array<String>) {
    // Create a new object from myCar class
    var car = NewCar()
    car.type = "Car"
    car.model = "Nissan"
    car.maxSpeed = 280

    car.show()

    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

    // Create a new object from Motorcycle class
    var motorcycle = Motorcycle()
    motorcycle.type = "Motorcycle"
    motorcycle.model = "Yamaha"
    motorcycle.maxSpeed = 100

    motorcycle.show()

}