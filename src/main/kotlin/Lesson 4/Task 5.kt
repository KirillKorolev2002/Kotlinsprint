package org.example.`Lesson 4`

fun main() {

    val theDamage = readln()
    val isDamaged = "Имеет повреждения корпуса"
    val isNoDamaged = "Не имеет повреждений корпуса"
    val haveDamagesToday = (theDamage != isDamaged) and (theDamage == isNoDamaged)

    val crewCount = readln().toInt()
    val crewCountCanBeOnTheShip = (THE_MINIMUM_OF_CREW <= crewCount) and (crewCount <= THE_MAXIMUM_OF_CREW)

    val provisionBoxes = readln().toInt()

    val isTheWeather = readln()
    val isBadWeather = "Неблагоприятная"
    val isGoodWeather = "Благоприятная"
    val theWeatherOnBoat = (isTheWeather != isBadWeather) and (isTheWeather == isGoodWeather)

    val theSail = (haveDamagesToday && crewCountCanBeOnTheShip && provisionBoxes > THE_MINIMUM_OF_PROVISION) and
            (crewCount == THE_MINIMUM_OF_CREW && theWeatherOnBoat && provisionBoxes >= THE_MINIMUM_OF_PROVISION)

    println(theSail)
}

const val THE_MINIMUM_OF_CREW = 55
const val THE_MAXIMUM_OF_CREW = 70
const val THE_MINIMUM_OF_PROVISION = 50
