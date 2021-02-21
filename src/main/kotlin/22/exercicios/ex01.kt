package `22`.exercicios

import java.util.*

fun main() {
    println("Digite primeira nota")
    val nota1 = Scanner(System.`in`).nextDouble()
    println("Digite segunda nota")
    val nota2 = Scanner(System.`in`).nextDouble()
    calcularMedia(nota1, nota2)
}

fun calcularMedia(nota1: Double, nota2: Double) {
    val media = (nota1/nota2)/2
    if (media >= 6) {
        println("media = " + media + ". Aluno aprovado!")
    }
    else {
        println("media = " + media + ". Aluno reprovado!")
    }
}