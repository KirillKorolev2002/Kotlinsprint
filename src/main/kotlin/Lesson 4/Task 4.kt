package org.example.`Lesson 4`

fun main() {
    val day = readln().toInt()

    val armAndAbsDay = day % 2 != 0
   val isEven = armAndAbsDay

    println(
        """
        Упражнения для рук:       ${armAndAbsDay}
        Упражнения для ног:       ${!isEven}
        Упражнения для спины:     ${!isEven}
        Упражнения для пресса:    ${armAndAbsDay}
    """.trimIndent()
    )
}