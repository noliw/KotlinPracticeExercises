package Meta

fun main() {
    for (col in 1..5){
        val numberOfSpaces = col - 1
        for (row in 1..numberOfSpaces){
            print("*")
        }
        println()

        println (true || false)
    }
}