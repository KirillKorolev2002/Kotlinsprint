package `Lesson 10`

fun main() {

    if (user() > computer()) {
        println("Победило человечество")
    } else {
        println("Победила машина")
    }
}

fun aRollOfTheDice(): Int = (1..6).random()
fun user(): Int {
    println("Бросает игрок")
    val usersTurn = aRollOfTheDice()
    val theResultOfUsersTurn = usersTurn
    println("Выпало у игрока:$theResultOfUsersTurn")
    return theResultOfUsersTurn
}

fun computer(): Int {
    println("Бросает компьютер")
    val computerTurn = aRollOfTheDice()
    val theResultOfComputersTurn = computerTurn
    println("Выпало у компьютера:$theResultOfComputersTurn")
    return theResultOfComputersTurn
}