package `Lesson 10`

fun main() {
    password()
}
fun password() {
    var thePassword = StringBuilder()
    val theSizeOfPassword = readln().toInt()
    for (counter in 1..theSizeOfPassword)
        if (counter % 2 != 0) {
            val theNumberOfNumerals = (1..9).random()
            thePassword = thePassword.append(theNumberOfNumerals)
        } else {
            val theNumberOfSymbols = ('!'..'/').random()
            thePassword = thePassword.append(theNumberOfSymbols)
        }
    println(thePassword)
}