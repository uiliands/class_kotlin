package `21`.exemplos

import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    println("Digite a palavra desejada")
    val palavra = input.next()

    println(retornaTamanho(palavra))
}

fun retornaTamanho(palavra: String): Int {
    return palavra.length
}