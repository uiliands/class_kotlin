//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
// receberá ainda um desconto de 10% sobre este total.
// Escreva um programa para ler a quantidade (em Kg) de morangos
// e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente, use função
package `22`.exercicios

import java.util.*

fun main() {
    println("Digite qtd. de quilos de morangos comprados")
    val kgMorangos = Scanner(System.`in`).nextInt()
    println("Digite qtd. de quilos de maças comprados")
    val kgMacas = Scanner(System.`in`).nextInt()
    println("Total de compras = R$" + calculaCompra(kgMorangos, kgMacas))

}

fun calculaCompra(kgMorangos: Int, kgMacas: Int): Double {
    val totalKg = kgMorangos + kgMacas
    var totalCompra: Double
    var totalCompraMorangos: Double
    var totalCompraMacas: Double

    if (kgMorangos <= 5) {
        totalCompraMorangos = (kgMorangos * 5.50)
    } else {
        totalCompraMorangos = (kgMorangos * 5.20)
    }

    if (kgMacas <= 5) {
        totalCompraMacas = (kgMacas * 3.80)
    } else {
        totalCompraMacas = (kgMorangos * 3.50)
    }

    totalCompra = (totalCompraMorangos+totalCompraMacas)
    if (totalKg > 8 || totalCompra > 25.0) {
        totalCompra = totalCompra - (totalCompra*0.1)
    }
    return totalCompra
}
