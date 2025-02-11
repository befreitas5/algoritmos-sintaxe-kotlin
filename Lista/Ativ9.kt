@file:JvmName("JDoodle")
fun main() {

    print("Digite a temperatura em Fahrenheit: ")
    val F = readLine()!!.toDouble()
    
    
    


    val c = 5 * ((F-32)/9)
    
    

    println("A temperatura em Celsius é $c")
}
