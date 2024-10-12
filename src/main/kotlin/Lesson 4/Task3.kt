package org.example.`Lesson 4`

fun main() {
    val theWeather = "Солнечная"
    val theWeatherToday = readln().toString()
    val theWeatherTodayAllowed: Boolean = theWeather == theWeatherToday
    val theTent = "Открыт"
    val theTentToday = readln().toString()
    val theTentTodayAllowed: Boolean = theTent == theTentToday
    val airHumidity: Int = 20
    val airHumidityToday = readln().toInt()
    val currentSeason: String = "Зима"
    val currentSeasonToday = readln().toString()

    val conditions =
        theWeatherTodayAllowed && theTentTodayAllowed && airHumidityToday == airHumidity && currentSeasonToday == currentSeason

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}
