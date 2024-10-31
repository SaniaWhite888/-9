import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 101)
    var attempts = 0

    println("Добро пожаловать в игру 'Угадай число'!")
    println("Я загадал число от 1 до 100.")

    while (true) {
        print("Введите ваше число: ")
        val guess = readLine()?.toIntOrNull() ?: 0

        attempts++

        when {
            guess > secretNumber -> println("Загаданное число меньше.")
            guess < secretNumber -> println("Загаданное число больше.")
            else -> {
                println("Поздравляю! Вы угадали число за $attempts попыток.")
                break
            }
        }
    }
}
