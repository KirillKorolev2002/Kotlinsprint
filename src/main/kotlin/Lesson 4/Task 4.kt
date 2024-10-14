package org.example.`Lesson 4`

fun main() {
    val day = readln().toInt()

    val Even = day % 2 == 0

    println(
        """
        Упражнения для рук:       ${!Even}
        Упражнения для ног:       ${Even}
        Упражнения для спины:     ${Even}
        Упражнения для пресса:    ${!Even}
    """.trimIndent()
    )
}