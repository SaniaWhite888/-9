fun main() {
    val inputString = "Hello, world!"

    var vowelsCount = 0
    var consonantsCount = 0

    for (char in inputString.lowercase()) {
        if (char in "aeiou") {
            vowelsCount++
        } else if (char in 'a'..'z') {
            consonantsCount++
        }
    }

    println("Гласных: $vowelsCount")
    println("Согласных: $consonantsCount")
}