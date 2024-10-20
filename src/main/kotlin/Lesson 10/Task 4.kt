package `Lesson 10`

fun main() {
    theChampion()
    theRepeatGame()
}

fun aRollOfTheDice(): Int = (1..6).random()
fun usersRoll(): Int {
    println("Бросает игрок")
    val usersTurn = aRollOfTheDice()
    val theResultOfUsersTurn = usersTurn
    println("Выпало у игрока:$theResultOfUsersTurn")
    return theResultOfUsersTurn
}

fun computersRoll(): Int {
    println("Бросает компьютер")
    val computerTurn = aRollOfTheDice()
    val theResultOfComputersTurn = computerTurn
    println("Выпало у компьютера:$theResultOfComputersTurn")
    return theResultOfComputersTurn
}
fun theChampion() {
    if (usersRoll() > computersRoll()) {
        println("Победило человечество")
    } else if (usersRoll() < computersRoll()){
        println("Победила машина")
    } else if (usersRoll() == computersRoll()){
        println("Chat gpt еще не доросла до победы")
    }
}
fun theRepeatGame() {
    for (j in generateSequence(0) { it }) {
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val usersAnswer = readln()
        if (usersAnswer == "Да") {
            theChampion()
        } else {
            println("Кол-во побед игрока:${whoIsTheChampion()}")
            break
        }
    }
}
fun whoIsTheChampion() {
    val win = "Победило человечество"
    var counter = 0
   return if (win == theChampion().toString()) {
        for (a in generateSequence(0) { it }) {
            counter++
            println("$counter")
        }
    } else {
        println("Неудачник")
   }
}

