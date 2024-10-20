package `Lesson 9`

fun main() {
    val theMap = mapOf(1 to 2, 2 to 50,3 to 15)
    val theNumberOfPortions = readln().toInt()

    val theNumberOfEggs = theMap.get(1)?.times(theNumberOfPortions)
    val theNumberOfMilk = theMap.get(2)?.times(theNumberOfPortions)
    val theNumberOfOil = theMap.get(3)?.times(theNumberOfPortions)

    println("На $theNumberOfPortions вам понадобится: Яиц – $theNumberOfEggs, молока – $theNumberOfMilk, сливочного масла – $theNumberOfOil")
}