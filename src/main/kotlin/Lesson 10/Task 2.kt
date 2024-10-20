package `Lesson 10`

fun main() {
    if (getLogin().toString() == "Логин недостаточно длинный" || getPassword().toString() == "Логин недостаточно длинный") {
        println("Не войдешь!")
    } else {
        println("Входи")
    }
}

fun getLogin() {
    val introduceLogin = readln()
    if (introduceLogin.length <= MAХIMUM_LENGTH) {
        println("Логин недостаточно длинный")
    } else {
        println(introduceLogin)
    }
}
fun getPassword() {
    val introducePassword = readln()
    if (introducePassword.length <= MAХIMUM_LENGTH) {
        println("Пароль недостаточно длинный")
    } else {
        println(introducePassword)
    }
}

const val MAХIMUM_LENGTH = 4