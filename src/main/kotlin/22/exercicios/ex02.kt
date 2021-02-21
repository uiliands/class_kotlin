//A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
//de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
//Escreva um programa que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
//o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
//(considere que o mês possua 4 semanas exatas). use função
package `22`.exercicios

import java.util.*

fun main() {
    println("Digite qtd. de horas trabalhadas:")
    val horasTrabalhadas = Scanner(System.`in`).nextInt()
    println("Digite valor do salário por hora:")
    val salarioHora = Scanner(System.`in`).nextDouble()

}

fun calcularSalario(horasTrabalhadas: Int, salarioHora: Double) {
    if (horasTrabalhadas > 40) {
        val horasExtras = horasTrabalhadas-40;

    }
}