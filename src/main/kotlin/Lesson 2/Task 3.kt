package org.example.`Lesson 2`

fun main() {
    val timeOfHoursOfDeparture = readln().toInt()
    val timeOfMinutesOfDeparture = readln().toInt()
    val timeOfWay = readln().toInt()
    val timeInWholeHours = timeOfWay / 60
    val timeInWholeMinutes = timeInWholeHours * 60
    val remainingTimeInMinutes = timeOfWay - timeInWholeMinutes
    val timeOfArrivalInHours = timeOfHoursOfDeparture + timeInWholeHours
    val timeOfArrivalInRemainingHours = (timeOfMinutesOfDeparture + remainingTimeInMinutes) / 60
    val timeOfArrivalInMinutes = timeOfArrivalInRemainingHours * 60
    val timeOfArrivalInRemainingMinutes = (timeOfMinutesOfDeparture + remainingTimeInMinutes) - timeOfArrivalInMinutes
    val timeOfArrivalInHoursFinal = timeOfArrivalInHours + timeOfArrivalInRemainingHours
    println("time is " + timeOfArrivalInHoursFinal + ":" + timeOfArrivalInRemainingMinutes)
}