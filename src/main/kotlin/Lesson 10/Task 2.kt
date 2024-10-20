package `Lesson 10`

fun main() {
    getLogin()
    getPassword()
}

fun getLogin() {
    val introduceLogin = readln()
    if (introduceLogin.length <= 4) {
        println("Логин недостаточно длинный")
    } else {
        println(introduceLogin)
    }
}
fun getPassword() {
    val introducePassword = readln()
    if (introducePassword.length <= 4) {
        println("Пароль недостаточно длинный")
    } else {
        println(introducePassword)
    }
}