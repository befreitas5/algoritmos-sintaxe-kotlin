@file:JvmName("JDoodle")
fun main() {

    print("Quanto você ganha por hora: ")
    val ganha = readLine()!!.toDouble()
    
    print("Quantas horas você trabalha por mês: ")
    val horas = readLine()!!.toDouble()
    
    


    val salario = ganha * horas
    
    

    println("Você ganha $salario por mês")
}
