package androidKotlin12

import java.time.temporal.TemporalAmount

// The class that inherits the features of another
// class is called Sub Class or child class
// the class whose features are inherited is called the super class or parent class




// Super/parent of the ElectricCar Class
open class Car(val name: String, val brand: String) {
    var range = 0.0

    fun extendReange(amount: Double){
        if(amount > 0) range += amount
    }

    fun drive(distance: Double){
        println("Drove for $distance KM")
    }

}


// Sub Class of Car class
class EelectricCar(name: String, brand: String, batteryLife: Double) : Car(name, brand) {

}


fun main() {
    var audiA3 = Car("A3", "Audi")
    var teslaY = EelectricCar("model-Y", "tesla", 85.0)

    audiA3.drive(200.0)
    teslaY.drive(100.0)
}