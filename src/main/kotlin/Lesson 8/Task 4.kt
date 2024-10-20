package `Lesson 8`

fun main() {
    val containsOfPizza = arrayOf("Ананас", "Колбаса", "Сыр", "Тесто", "Соус", "Специи")
    println("$containsOfPizza")
    val theInformationAboutIngredient = readln()

    if (theInformationAboutIngredient in containsOfPizza) {
        println("В рецепте есть $theInformationAboutIngredient")

        val theNumberOfChangeElement = containsOfPizza.indexOf()
        val theChangeTheElement = readln()
        containsOfPizza.set(theNumberOfChangeElement, theChangeTheElement)
        println("Готово! Вы сохранили следующий список: ${containsOfPizza.contentToString()}")
    } else {
        println("В рецепте нет")
    }
}