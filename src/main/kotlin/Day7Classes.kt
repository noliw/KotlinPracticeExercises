fun main(args: Array<String>) {
    class User () {
        var name = ""
        var email = ""
        var age = 0

        fun userProfile (): String {
            return "Profile Name : $name " +
                    "Email: $email " +
                    "Age: $age"

        }
    }

    var oli = User()
    oli.name = "Noli"
    oli.email = "Noliw2017@gmail.com"
    oli.age = 22

    println(oli.userProfile())
}
