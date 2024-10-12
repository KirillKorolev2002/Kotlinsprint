package org.example.`Lesson 4`

fun main() {
    val theSunnyWeather = "Солнечная"
    val theWeatherToday = "Солнечная"
    val theWeatherTodayAllowed: Boolean = theSunnyWeather == theWeatherToday
    val theTent = "Открыт"
    val theTentToday = "Открыт"
    val theTentTodayAllowed: Boolean = theTent == theTentToday
    val airHumidity: Int = 20
    val airHumidityToday = 20
    val currentSeason: String = "Не Зима"
    val currentSeasonToday = "Зима"

    val conditions =
        theWeatherTodayAllowed && theTentTodayAllowed && airHumidityToday == airHumidity && currentSeasonToday == currentSeason

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}
