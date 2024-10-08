package org.example.`Lesson 2`

import kotlin.math.pow

fun main() {
    val PV = 70000
    val r = 0.167
    val FV = PV * (1 + r).pow(20.0)
    print(String.format("%.3f", FV))
}