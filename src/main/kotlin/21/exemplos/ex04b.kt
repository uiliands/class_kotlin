//– Crie uma template String que ao digitar um nome, ele mostre todos os caracteres em
//Mauisculo exemplo: entrada: huelton saida: HUELTON verifique qual função podemos fazer
//isso, Use função tbm para elevar o nivel com parametro default.
package `21`.exemplos

import java.util.*

fun main() {
    println("Digite seu nome.")
    converteMaisculo(Scanner(System.`in`).nextLine())
}

fun converteMaisculo(nome:String) {
    println("Nome em maisculo: ${nome.toUpperCase()}")
}