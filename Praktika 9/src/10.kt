fun longestWord(text: String): String {
    // Разбиваем строку на слова, игнорируя знаки препинания
    val words = text.split(Regex("[\\p{Punct}\\s]+"))

    // Находим самое длинное слово
    var longestWord = words[0]
    for (word in words) {
        if (word.length > longestWord.length) {
            longestWord = word
        }
    }

    return longestWord
}