//Faça um programa para ler o preço de 10 produtos ou o quanto achar necessário
//(while), calcular e escrever:
//- O maior preço lido
//- A média dos preços dos produtos
package `23`

import java.util.*

fun main() {
    calcularMaiorMedia()
}

fun calcularMaiorMedia() {
    var continua: String = "s"
    var (maior, soma, num, qtd) = listOf(0, 0, 0, 0)

    while (continua == "s") {
        println("Digite um numero: ")
        num = Scanner(System.`in`).nextInt()

        if (num > maior) {
            maior = num
        }
        soma += num
        qtd++

        println("Deseja digitar outro numero? [s]im [n]ão: ")
        continua = Scanner(System.`in`).next()
    }

    println("Maior número lido: $maior")
    println("Média dos números lidos:" + soma/qtd)
}