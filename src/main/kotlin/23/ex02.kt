//Faça um programa para ler uma quantidade e a seguir ler esta quantidade de
//números. Depois de ler todos os números o algoritmo deve apresentar na tela
// o maior dos números lidos e a média dos números lidos
package `23`

import java.util.*

fun main() {

    val numeros: MutableList<Int> = mutableListOf()

    println("Digite qtd. de números a ser digitados: ")
    var qtd: Int = Scanner(System.`in`).nextInt()

    for (i in 1..qtd) {
        println("Digite um valor: ")
        numeros.add(Scanner(System.`in`).nextInt())
    }

    fazerCalculos(qtd, numeros)
}

fun fazerCalculos(qtd: Int, numeros: MutableList<Int>) {
    for (i in 0..qtd) {
        println(numeros[i])
    }
}