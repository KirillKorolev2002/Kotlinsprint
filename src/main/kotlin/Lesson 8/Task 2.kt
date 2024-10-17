package `Lesson 8`

fun main() {
    val containsOfPizza = arrayOf("Ананас", "Колбаса", "Сыр", "Тесто", "Соус", "Специи")
    val theProduct = readln()
    for (contains in containsOfPizza.indices) {
            if (containsOfPizza[contains] == theProduct) {
                    println("Ингредиент $theProduct в рецепте есть")
                    break
            }else
            {
                println("Такого ингредиента в рецепте нет")
            }
        }
    }

