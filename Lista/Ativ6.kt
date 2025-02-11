@file:JvmName("JDoodle")
import kotlin.math.PI

fun main() {
    print("Digite o raio do círculo: ")
    val raio = readLine()!!.toDouble()

    
    println("A área do círculo é: ${PI * raio * raio}")
}
