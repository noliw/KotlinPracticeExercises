package completeUdemy

fun main() {
 val view = View()
    val button = Button("Login", "Center")
    val roundBtn = RoundBtn("SignUp", "Center", 30)

    view.draw()
    button.draw()
    roundBtn.draw()
}

open class View () {
    open fun draw() {
        println("Drawing the view")
    }
}

open class Button (val text: String, val orientation: String) : View(){

    override fun draw() {
        println("Drawing the button")

    }
}

class RoundBtn(text: String, orientation: String, val corners: Int): Button(text, orientation){
    override fun draw() {
        println("Drawing the Round button")

    }
}