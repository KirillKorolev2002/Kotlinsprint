package org.example.`Lesson 4`

fun main() {
    val theWeightCargo = readln().toInt()
    val theVolumeCargo = readln().toInt()
    val isConditionOneRespondAverage = theWeightCargo <= THE_MAXIMUM_WEIGHT_OF_CARGO && THE_MINIMUM_WEIGHT_OF_CARGO < theWeightCargo
    val isConditionTwoRespondAverage = theVolumeCargo < THE_MAXIMUM_VOLUME_OF_CARGO
    println("Груз с весом $theWeightCargo кг и объемом $theVolumeCargo л соответствует категории 'Average': ${(isConditionOneRespondAverage) && (isConditionTwoRespondAverage)}")
}

val THE_MINIMUM_WEIGHT_OF_CARGO = 35
val THE_MAXIMUM_WEIGHT_OF_CARGO = 100
val THE_MAXIMUM_VOLUME_OF_CARGO = 100