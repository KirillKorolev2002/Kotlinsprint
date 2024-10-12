package org.example.`Lesson 4`

fun main() {
    val day = readln().toInt()

    val armAndAbsDay = day % 2 != 0
    val legAndBackDay = day % 2 == 0

    println(
        """
        Упражнения для рук:       ${armAndAbsDay}
        Упражнения для ног:       ${legAndBackDay}
        Упражнения для спины:     ${legAndBackDay}
        Упражнения для пресса:    ${armAndAbsDay}
    """.trimIndent()
    )
}