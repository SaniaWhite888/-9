fun isAnagram(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }

    val sortedStr1 = str1.lowercase().toCharArray().sortedArray()
    val sortedStr2 = str2.lowercase().toCharArray().sortedArray()

    return sortedStr1.contentEquals(sortedStr2)
}

fun main() {
    val str1 = "listen"
    val str2 = "silent"

    if (isAnagram(str1, str2)) {
        println("$str1 и $str2 - анаграммы")
    } else {
        println("$str1 и $str2 - не анаграммы")
    }
}