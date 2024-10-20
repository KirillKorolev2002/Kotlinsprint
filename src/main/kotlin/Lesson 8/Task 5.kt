package `Lesson 8`

fun main() {
    println("Введите количество ингредиентов:")
    val count = readln().toInt()

    val ingredients = arrayOf(" ")

    for (i in 0 until count) {
        ingredients[i] = readln()
    }

    println("Введенные ингредиенты: ${ingredients.joinToString(", ")}")
}