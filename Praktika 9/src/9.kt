import kotlin.random.Random

fun generatePassword(length: Int): String {
    val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9') + "!$%^&()-+"
    return (1..length).map { chars.random() }.joinToString("")
}

fun main() {
    print("Введите желаемую длину пароля: ")
    val passwordLength = readLine()?.toIntOrNull() ?: 8

    val password = generatePassword(passwordLength)
    println("Сгенерированный пароль: $password")
}
