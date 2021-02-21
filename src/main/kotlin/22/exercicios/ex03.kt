//Escreva um programa que leia o número de litros vendidos e o tipo de combustível
// (codificado da seguinte forma: Aálcool, G-gasolina),
// calcule e imprima o valor a ser pago pelo cliente
// sabendo-se que o preço do litro da gasolina é R$ 4,60 e o preço do litro do álcool é R$ 3,20,
// use função e um layout bonito para o funcionário que esta calculando o valor, use função
package `22`.exercicios

import java.util.*

fun main() {
    println("Digite o número de litros:")
    val litros = Scanner(System.`in`).nextDouble()
    println("Digite o combustível: [a]lcool [g]asolina")
    val combustivel = Scanner(System.`in`).next()

    println(calcularValor(litros, combustivel))
}

fun calcularValor(litros: Double, combustivel: String): Double {
    var valorTotal: Double = 0.0
    if (combustivel == "a") {
        if (litros <= 20) {
            valorTotal = (litros * 3.20)-(litros * 3.20 * 0.03)
        } else {
            valorTotal = (litros * 3.20)-(litros * 3.20 * 0.05)
        }
    }

    if (combustivel == "g") {
        if (litros <= 20) {
            valorTotal = (litros * 4.6)-(litros * 3.20 * 0.04)
        } else {
            valorTotal = (litros * 4.6)-(litros * 3.20 * 0.06)
        }
    }
    return valorTotal
}