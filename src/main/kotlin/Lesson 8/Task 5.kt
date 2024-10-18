package `Lesson 8`

fun main() {
    val numberOfElements = readln().toInt()
    for (i in 0 until numberOfElements) {
        val theNameOfElement = readln()
        val theNewElement = theNameOfElement.split(" ")
        //  val theNewMassiv=theNewElement.slice(0 until numberOfElements)
        println(theNewElement)
    }
}