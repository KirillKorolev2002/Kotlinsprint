package `Lesson 9`

fun main() {

    val input = readln()

    val ingredientsList = input.split(", ").toMutableList()

     val sortedIngredients = ingredientsList.sorted()

    sortedIngredients.forEach { println(it) }
}