package Meta

fun main() {
    val height = 10
    for (i in 1..height) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}