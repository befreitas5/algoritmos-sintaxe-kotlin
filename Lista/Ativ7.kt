@file:JvmName("JDoodle")
fun main() {

    print("Informe o tamanho do lado do quadrado: ")
    val quadrado = readLine()!!.toDouble()


    val area = quadrado * quadrado
    
    val area2 = area * 2

    println("A área do quadrado é $area, e o dobro da sua área é $area2")
}
