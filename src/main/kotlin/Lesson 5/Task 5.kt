package org.example.`Lesson 5`

fun main() {

    val userYearOfBirth = readln().toInt()
    val theYearToday = readln().toInt()
    val theUserAgeInYears: Int

    if (theYearToday < userYearOfBirth) {
        theUserAgeInYears = userYearOfBirth - theYearToday
    } else {
        theUserAgeInYears = theYearToday - userYearOfBirth
    }
    if (theUserAgeInYears >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Иди учи уроки")
    }
}
const val AGE_OF_MAJORITY = 18

