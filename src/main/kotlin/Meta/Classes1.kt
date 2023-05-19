package Meta

fun main() {
    val P1 = Player("Nicola", "Tesla")
    val P2 = Player("Thomas", "Edison")
    println(P1.fullName())
    println(P2.fullName())

    val scoring = Scores()
    var lvlScore = 0

// level 1
    lvlScore = 20
// delete this line and complete your code here
    scoring.checkScore(0,20)

// level 2
    lvlScore = 35
// delete this line and complete your code here

// level 3
    lvlScore = 25
// delete this line and complete your code here
}


class Player(
    val name: String,
    val surName: String,
    var totalScore: Double = 0.0,
    var personalBestScore: Double = 0.0
) {

    fun fullName(): String {
        return "$name $surName"
    }
}

class Scores() {
    fun checkScore(best: Int, current: Int): Int {
        if (best < current) {
            return current;
        }
        return best;
    }
}