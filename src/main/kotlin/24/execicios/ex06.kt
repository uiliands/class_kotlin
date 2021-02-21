package `24`.execicios

import java.util.*

fun main() {
    val salarios: MutableList<Double> = mutableListOf()
    val filhos: MutableList<Int> = mutableListOf()

    do {
        println("Digite salario")
        val salario = Scanner(System.`in`).nextDouble()
        salarios.add(salario)
        println("Digite numero de filhos")
        filhos.add(Scanner(System.`in`).nextInt())
    } while (salario > 0)

    exibeDados(salarios, filhos);
}

fun exibeDados(salarios: MutableList<Double>, filhos: MutableList<Int>) {
    var somaSalarios: Double = 0.0
    var maiorSalario: Double = 0.0
    var (qtdHab, qtdMenorSalario, somaFilhos) = listOf(0, 0, 0)

    for (salario in salarios) {
        if (salario > maiorSalario) {
            maiorSalario = salario
        }
        if (salario > 900.00) {
            qtdMenorSalario++
        }
        somaSalarios += salario
        qtdHab++
    }

    for (filho in filhos) {
        somaFilhos += filho
    }
    println(qtdMenorSalario)
    println("Média de salário da população: " + somaSalarios/qtdHab)
    println("Média do número de filhos: " + somaFilhos/qtdHab)
    println("Maior salário dos habitantes: " + maiorSalario)
    println("Percentual de pessoas com salário menor que R\$ 900,00: " + (qtdMenorSalario*100)/qtdHab)
}