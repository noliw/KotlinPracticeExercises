fun main(args: Array<String>) {
    val max = getMax(5, 8)
    println(max)
    println("------------------------")
    println()
//    default params
    sendMessage("Noli")

    println("----------------------------")
    println()
//    named param
    sendMessage(message = "Ollaaaaa")
    println("----------------------------")
    println()
//    vararg keyword
    println(sum(5,6,7,10, 56))

}

fun getMax(a: Int, b: Int) = if (a > b) a else b

//Default Params

fun sendMessage(name: String = "dad", message: String = "No message") {
    println("$name has the following message: $message")
}

// vararg keyword
fun sum(vararg numbers: Int) = numbers.sum()