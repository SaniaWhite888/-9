fun main() {
    print("Введите строку: ")
    val inputString = readLine() ?: ""

    val outputString = inputString.toCharArray().map {
        if (it.isLowerCase()) it.uppercaseChar() else it.lowercaseChar()
    }.joinToString("")

    println(outputString)
}