package Oak

open class Vehicle {
    var type: String? = null
    var model: String? = null
    var maxSpeed: Int? = null

    fun show () {
        println("Type: $type")
        println("Model: $model")
        println("Maximum Speed: $maxSpeed")
    }
}