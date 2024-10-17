package `Lesson 8`

fun main() {
    val containsOfPizza = arrayOf("Ананас", "Колбаса", "Сыр", "Тесто", "Соус", "Специи")
    val theProduct = readln()
    if (theProduct == containsOfPizza[0]) {
        println("В рецепте есть $theProduct")
    } else if (theProduct == containsOfPizza[1]) {
        println("В рецепте есть $theProduct")
    } else if (theProduct == containsOfPizza[2]) {
        println("В рецепте есть $theProduct")
    } else if (theProduct == containsOfPizza[3]) {
        println("В рецепте есть $theProduct")
    } else if (theProduct == containsOfPizza[4]) {
        println("В рецепте есть $theProduct")
    } else if (theProduct == containsOfPizza[5]) {
        println("В рецепте есть $theProduct")
    } else {
        println("В рецепте нет")
    }
}

