package `Lesson 8`

fun main() {
    val containsOfPizza = arrayOf("Ананас", "Колбаса", "Сыр", "Тесто", "Соус", "Специи")
    val theProduct = readln()
    if (theProduct in containsOfPizza[0].. containsOfPizza[5]) {
        println("В рецепте есть $theProduct")
    } else {
        println("В рецепте нет")
    }
}

