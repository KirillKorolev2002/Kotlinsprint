package `Lesson 9`

fun main() {

    val theList = mutableListOf("Тесто", "Ананас", "Колбаса")
    println("В рецепте есть базовые ингредиенты: $theList")
    println("Желаете добавить еще? Да или нет?")
    val theAnswer = readln()

    if (theAnswer == "Да") {
        println("Какой ингредиент вы хотите добавить?")
        val theNewElementOfTheList = readln()
        theList.add(theNewElementOfTheList)
        println("$theList")
    } else {
        println("Завершаю работу")
    }
}