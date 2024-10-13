package org.example.`Lesson 4`

fun main() {
    val isSunnyWeather = "Солнечная"
    val isWeatherToday = "Солнечная"
    val isWeatherTodayAllowed: Boolean = isSunnyWeather == isWeatherToday
    val isTentOpen = "Открыт"
    val isTentTodayOpen = "Открыт"
    val isTentTodayAllowed: Boolean = isTentOpen == isTentTodayOpen

    val currentSeasonToday = "Зима"
    val currentSeason = "Осень"
    currentSeason != currentSeasonToday
    val conditions =
        isWeatherTodayAllowed && isTentTodayAllowed && AIR_HUMIDITY == AIR_HUMIDITY_TODAY && currentSeasonToday == currentSeason

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}

const val AIR_HUMIDITY: Int = 20
const val AIR_HUMIDITY_TODAY = 20