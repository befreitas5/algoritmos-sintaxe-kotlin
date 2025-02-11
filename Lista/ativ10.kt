@file:JvmName("JDoodle")
import kotlin.math.PI

fun main() {
    print("Digite a temperatura em graus celsius: ")
    val c = readLine()!!.toDouble()

    val f = c * 1.8 + 32
    println("A temperatura em Fahrenheit é $f")
}
