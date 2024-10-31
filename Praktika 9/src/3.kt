fun main() {
    val usdToEurRate = 0.92 // текущий курс USD к EUR

    print("Введите сумму в долларах: ")
    val usdAmount = readLine()?.toDoubleOrNull() ?: 0.0

    val eurAmount = usdAmount

            println("$usdAmount USD = $ EUR")
}