package org.example.`Lesson 4`

fun main() {

    val theDamage = readln()
    val hasDamage = "Имеет повреждения корпуса"
    val noDamage = "Не имеет повреждений корпуса"
    val haveDamagesToday = (theDamage != hasDamage) and (theDamage == noDamage)

    val crewCount = readln().toInt()
    val theMinimumOfCrew = 55
    val theMaximumOfCrew = 70
    val theMinimumOfProvision = 50
    val crewCountCanBeOnTheShip = (theMinimumOfCrew <= crewCount) and (crewCount <= theMaximumOfCrew)

    val provisionBoxes = readln().toInt()

    val theWeather = readln()
    val badWeather = "Неблагоприятная"
    val goodWeather = "Благоприятная"
    val theWeatherOnBoat = (theWeather != badWeather) and (theWeather == goodWeather)

    val theSail = (haveDamagesToday && crewCountCanBeOnTheShip && provisionBoxes > theMinimumOfProvision) and
            (crewCount == theMaximumOfCrew && theWeatherOnBoat && provisionBoxes >= theMinimumOfProvision)

    println(theSail)
}