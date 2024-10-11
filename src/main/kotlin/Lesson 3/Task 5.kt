package org.example.`Lesson 3`

fun main() {

    val sentOnServer = "D2-D4;0"

    val theNewStepFrom = "D2"
    val theNewStepOn = "D4"
    val theNewNumberOfStep = 0

    val NewsentOnServer = """
        $theNewStepFrom
        $theNewStepOn
        $theNewNumberOfStep
    """.trimIndent()

    println(NewsentOnServer)

}