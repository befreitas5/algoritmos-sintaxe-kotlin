@file:JvmName("JDoodle")
fun main() {

    print("Informe a quantidade em metros: ")
    val metros = readLine()!!.toDouble()


    val centimetros = metros * 100

    println("$metros metros equivalem a $centimetros centímetros.")
}
