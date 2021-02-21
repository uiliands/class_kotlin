//Crie um programa que faça a leitura de cinco numeros, mas vc deve escrever por
//extenso, no final mostrar o numero do lado: ex:
//1 - um
//2 - dois
//3 - tres
//4 - quatro
//5 - cinco
package `23`

fun main() {

    val numeros: MutableList<String> = mutableListOf()

    for (i in 1..5) {
        println("Digite o $i número desejado por extenso")
        val numero = readLine()
        numeros.add(numero.toString())
    }

    for((indice, numero) in numeros.withIndex()) {
        println("${indice+1} - $numero")
    }

}