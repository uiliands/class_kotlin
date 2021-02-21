package `22`.exemplos

import java.util.*

fun main() {
    println("Digite um número: ")
    verificarPosNeg(Scanner(System.`in`).nextInt())
}

fun verificarPosNeg(valor: Int){
    if(valor>=0) println("positivo") else println("negativo")
}