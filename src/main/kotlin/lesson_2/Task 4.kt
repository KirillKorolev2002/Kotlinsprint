package org.example.lesson_2

fun main() {
    val theNumberInRange = (1..9).random()
    var countOfTriesUsers = COUNT_OF_TRIES
    while (countOfTriesUsers > 0) {
        val resultOfNumber = theNumberInRange
        val triesOfUser = readln().toInt()
        if (triesOfUser == resultOfNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            countOfTriesUsers--
            println("Неверно")
            println("Осталось попыток:$countOfTriesUsers")
        }
    }
    println("Было загадано число $theNumberInRange")
}

const val COUNT_OF_TRIES = 5
