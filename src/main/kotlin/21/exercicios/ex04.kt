//– crie um lista mutavel de produto, adicione valores nela e mostre no final:
//Quantidade de produto, Nome do Produto e o valor do produto vezes a quantidade
//Use Scanner e mutableListOf, verifique a necessidade de criar uma funções no processo

package `21`.exercicios

import java.util.*

fun main() {
    val compras: MutableList<Any> = mutableListOf()
    val scan = Scanner(System.`in`)

    println("Digite o nome do produto")
    val produto: String = scan.nextLine()
    compras.add(produto)

    println("Digite o valor do produto")
    val valor: Double = scan.nextDouble()
    compras.add(valor)

    println("Digite o quantidade do produto")
    val qtd: Int = scan.nextInt()
    compras.add(qtd)

    compra(compras)
}

fun compra(compras: MutableList<Any>) {
    println("Nome da compra: " + compras[0]+
    " \nQuantidade " + compras[2]+
    " \nValor unitario " + compras[1]+
    " \nValor total da compra: "+
    multiplica(compras[2].toString(), compras[1].toString()))
}

fun multiplica(x: String, y: String): Any = x.toDouble() * y.toDouble()