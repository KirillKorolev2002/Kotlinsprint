package org.example.`Lesson 4`

fun main () {
    val theMinimumWeightOfCargo=35
    val theMaximumWeightOfCargo=100
    val theMaximumVolumeOfCargo=100
    val theWeightCargo=readln().toInt()
    val theVolumeCargo=readln().toInt()


    println("Груз с весом $theWeightCargo кг и объемом $theVolumeCargo л соответствует категории 'Average': ${ (theWeightCargo <= theMaximumWeightOfCargo && theMinimumWeightOfCargo < theWeightCargo) and (theVolumeCargo < theMaximumVolumeOfCargo)}")
}