package `Lesson 8`

fun main() {
    var containsOfPizza = arrayOf("Ананас", "Колбаса", "Сыр", "Тесто", "Соус", "Специи")
    println(containsOfPizza)
    val theInformationAboutIngredient = readln().toString()
    if (theInformationAboutIngredient in containsOfPizza) {
        println("В рецепте есть $theInformationAboutIngredient")
        val addTheIngredient = readln().toString()
        containsOfPizza += addTheIngredient
        println("Готово! Вы сохранили следующий список: ${containsOfPizza.contentToString()}")
    } else {
        println("В рецепте нет")
    }
}