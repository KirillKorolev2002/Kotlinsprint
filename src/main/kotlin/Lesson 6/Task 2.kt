package org.example.`Lesson 6`

fun main() {
    val numberOfSeconds = readln().toInt()
    var counterNumberOfSeconds = numberOfSeconds
    do {
        counterNumberOfSeconds--
        Thread.sleep(1000)
    } while (counterNumberOfSeconds > 0)
    println("Прошло $numberOfSeconds секунд")
}