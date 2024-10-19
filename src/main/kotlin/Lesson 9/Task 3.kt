package `Lesson 9`

fun main() {
    val theList = listOf<Int>(2, 50, 15)
    val theNumberOfPortions = readln().toInt()

    val theNumberOfEggs = theList.get(0) * theNumberOfPortions
    val theNumberOfMilk = theList.get(1) * theNumberOfPortions
    val theNumberOfOil = theList.get(2) * theNumberOfPortions

    println("На $theNumberOfPortions вам понадобится: Яиц – $theNumberOfEggs, молока – $theNumberOfMilk, сливочного масла – $theNumberOfOil")
}