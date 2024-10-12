package org.example.`Lesson 4`

fun main() {
    val theWeightCargo = readln().toInt()
    val theVolumeCargo = readln().toInt()
    val conditionOne = theWeightCargo <= THE_MAXIMUM_WEIGHT_OF_CARGO && THE_MINIMUM_WEIGHT_OF_CARGO < theWeightCargo
    val conditionTwo = theVolumeCargo < THE_MAXIMUM_VOLUME_OF_CARGO
    println("Груз с весом $theWeightCargo кг и объемом $theVolumeCargo л соответствует категории 'Average': ${(conditionOne) and (conditionTwo)}")
}

val THE_MINIMUM_WEIGHT_OF_CARGO = 35
val THE_MAXIMUM_WEIGHT_OF_CARGO = 100
val THE_MAXIMUM_VOLUME_OF_CARGO = 100