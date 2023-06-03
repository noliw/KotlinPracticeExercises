package androidKotlin12

data class Value(val value: Int)

fun main() {
    val value1 = Value(42)
    val value2 = Value(42)
    println(value1 == value2)
}