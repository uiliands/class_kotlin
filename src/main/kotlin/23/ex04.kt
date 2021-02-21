//Faça um programa para interar ate 300 com step 10, mostre a iteração na tela, mas
//quando chegar em 290 dar um BREAK e depois informar que não foi possivel chegar ate
//300 na iteração
package `23`

fun main() {
    for (i in 0..300 step 10) {
        println(i)
        if (i == 290) {
            println("não foi possível chegar até 300")
            break
        }
    }
}