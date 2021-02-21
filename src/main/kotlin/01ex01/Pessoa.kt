package `01ex01`
//forma reduzida
//class Pessoa (
//    var nome: String,
//    var dataNascimento: String,
//    var altura: Double
//)
//

// forma comum
class Pessoa {
    var nome: String
    var dataNascimento: String
    var altura: Double

    constructor(nome: String,dataNascimento: String, altura: Double) {
        this.nome = nome
        this.dataNascimento = dataNascimento
        this.altura = altura
    }

fun exibirDados() {
    println(this.nome + " nasceu em $dataNascimento tem " + this.calculaIdade() + " anos e possui $altura de altura")
}

fun calculaIdade(): Int {
    var anoNascimento = this.dataNascimento.takeLast(4).toInt()
    var idade = 2021-anoNascimento
    return idade
}

}
