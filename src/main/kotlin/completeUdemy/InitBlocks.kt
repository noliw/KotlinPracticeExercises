package completeUdemy

fun main() {
    val user = User("Nola", "W", 22)
}

class User(Inpname: String, var lastName: String, var age: Int){
    var name: String

    init {
        if(Inpname.lowercase().startsWith("a")){
            this.name = Inpname
        } else {
            this.name = "User"
            println("The name doesn't start with the letter 'a' or 'A'")
        }
    }
}