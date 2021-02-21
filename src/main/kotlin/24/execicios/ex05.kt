//Escreva um Programa que permita a leitura dos nomes de 10 pessoas
// e armaze os os nomes lidos em uma lista.
//Após isto, o programa deve permitir a leitura de mais 1 nome qualquer de pessoa
// e depois escrever a mensagem ACHEI,
//se o nome estiver entre os 10 nomes lidos anteriormente (guardados na lista),
// ou NÃO ACHEI caso contrário.

package `24`.execicios

fun main() {
    val nomes: MutableList<String> = mutableListOf()

    for (i in 0..9) {
        println("Digite nome da pessoa " + (i+1))
        val nome = readLine()
        nomes.add(nome.toString())
    }

    println("Digite nome da pessoa a procurar")
    val nome = readLine()
    println(procuraPessoa(nome.toString(), nomes))
}

fun procuraPessoa(nome: String, nomes: MutableList<String>): String {
    var resultado: String = "NÃO ACHEI"
    for (nomeAProcurar in nomes) {
        if (nome == nomeAProcurar) {
            resultado = "ACHEI"
        }
    }
    return resultado
}