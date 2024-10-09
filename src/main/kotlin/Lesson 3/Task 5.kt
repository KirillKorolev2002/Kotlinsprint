package org.example.`Lesson 3`

fun main() {
    val theStepFrom = "D2"
    val theStepOn = "D4"
    val theNumberOfStep = 0
    val sentOnServer = "$theStepFrom-$theStepOn;$theNumberOfStep"
    println(sentOnServer)
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