package org.example.`Lesson 4`

fun main() {
    val allNumberOfTables = 13
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9

    val isAvailableToday = reservedTablesToday < allNumberOfTables
    val isAvailableTomorrow = reservedTablesTomorrow < allNumberOfTables

    println("Доступность столиков на сегодня: $isAvailableToday")
    println("Доступность столиков на завтра: $isAvailableTomorrow")
}