//- Faça um programa para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
//escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
//ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
//Use função
package `24`.execicios

import java.util.*

fun main() {
    println("Digite numero da conta")
    val conta = Scanner(System.`in`).nextInt()
    println("Digite saldo")
    val saldo = Scanner(System.`in`).nextDouble()
    println("Digite debito")
    val debito = Scanner(System.`in`).nextDouble()
    println("Digite credito")
    val credito = Scanner(System.`in`).nextDouble()

    exibirSaldoAtual(saldo, debito, credito)

}

fun exibirSaldoAtual(saldo: Double, debito: Double, credito: Double) {
    var saldo = saldo - debito + credito
    if (saldo >= 0) {
        println("Saldo positivo")
    } else {
        println("Saldo negativo")
    }
    println("Saldo atual: $saldo")
}

