package `Lesson 11`

fun main() {

    val metadata = User()
    metadata.id = "@kirillkorolev2002"
    metadata.login = 4040
    metadata.password = "Losost"
    metadata.mail = "kirillkorolev2002@mail.ru "
    println(metadata.userToString())
    val metadataold = OldUser()
    metadataold.id = "@gleb.nikitin9696"
    metadataold.login = 4040
    metadataold.password = "Losost"
    metadataold.mail = "gleb.nikitin.9696@mail.ru "
    println(metadataold.userToString())
}

class User(
    var id: String = " ",
    var login: Int = 40,
    var password: String = " ",
    var mail: String = " ",
) {
    fun userToString(): String {
        return "id: $id  login: $login password: $password  mail: $mail"
    }
}

class OldUser(
    var id: String = " ",
    var login: Int = 40,
    var password: String = " ",
    var mail: String = " ",
) {

    fun userToString(): String {
        return "id: $id  login: $login password: $password  mail: $mail"
    }
}
