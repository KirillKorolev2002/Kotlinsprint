package `Lesson 7`

fun main() {
    val charRangeForPassword: CharRange = 'a'..'z'
    val intRangeForPassword: IntRange = 0..9
    val charRangeForPasswordBig: CharRange = 'A'..'Z'
    val thePassword = StringBuilder()
    val isLengthOfPassword = readln().toInt()
    //– минимальная длина пароля 6 символов.Не совсем понятно как это условие описать правильно
    if (isLengthOfPassword >= 6) {
        for (i in 1 until isLengthOfPassword) {
                val randomWords = charRangeForPassword.random()
                thePassword.append(randomWords)
                val randomNumbers = intRangeForPassword.random()
                thePassword.append(randomNumbers)
                val randomNumbersBig = charRangeForPasswordBig.random()
                thePassword.append(randomNumbersBig)
            }
        }
    println(thePassword)
    }
