package `22`.exemplos

import java.util.*

fun main() {
    println("Digite um número")
    verifica10(Scanner(System.`in`).nextInt())
//    teste nulo
//    var numero: Int?
//    numero = null
//    verifica10(numero)
}

fun verifica10(valor: Int?) {
    when {
        valor == null -> println("valor nulo")
        valor > 10 -> println("maior que 10")
        valor < 10 -> println("menor que 10")
    }
}