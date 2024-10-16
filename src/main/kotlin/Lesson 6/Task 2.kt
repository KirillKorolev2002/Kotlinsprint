package org.example.`Lesson 6`

fun main() {
    val numberOfSeconds = readln().toInt()
    var counterNumberOfSeconds = numberOfSeconds
        counterNumberOfSeconds > 0
        counterNumberOfSeconds--
        Thread.sleep(1000)
    println("Прошло $numberOfSeconds секунд")
}