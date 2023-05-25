package androidKotlin12

fun main() {
    var samsung = MobilePhone("Android", "Samsung", "Galaxy S21 ultra")
}

class MobilePhone (osName: String, brand: String, model: String) {
    init {
        println("The $osName phone is made by the $brand brand, and the model is $model")
    }
}