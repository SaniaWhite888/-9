import kotlin.random.Random

fun main() {
    for (i in 1..10) {
        println(Random.nextInt(1, 101)) // генерируем случайное число от 1 до 100
    }
}