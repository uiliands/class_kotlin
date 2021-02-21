//Faça um programa para ler: quantidade atual em estoque, quantidade máxima em estoque e
//quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
//média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
//a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
//compra', use função
package `24`.execicios

import java.util.*

fun main() {
    var (qtdEmEstoque, qtdMaxEstoque, qtdMinEstoque) = listOf(0, 0, 0)
    println("Digite a qtd. em estoque")
    qtdEmEstoque = Scanner(System.`in`).nextInt()
    println("Digite a qtd. máxima em estoque")
    qtdMaxEstoque = Scanner(System.`in`).nextInt()
    println("Digite a qtd. mínima em estoque")
    qtdMinEstoque = Scanner(System.`in`).nextInt()
    //10, 100, 5
    calculaMedia(qtdEmEstoque, qtdMaxEstoque, qtdMinEstoque)
}

fun calculaMedia(qtdEmEstoque: Int, qtdMaxEstoque: Int, qtdMinEstoque: Int) {
    val qtdMedia = (qtdMaxEstoque/qtdMinEstoque)/2
    if(qtdEmEstoque >= qtdMedia) {
        println("Não efetuar compra")
    } else {
        println("Efetuar compra")
    }
}