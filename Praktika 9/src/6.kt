fun sortStrings(strings: Array<String>): Array<String> {
    return strings.sortedArray()
}

fun main() {
    val strings = arrayOf("apple", "banana", "cherry", "date")
    val sortedStrings = sortStrings(strings)
    println(sortedStrings.joinToString(", "))
}