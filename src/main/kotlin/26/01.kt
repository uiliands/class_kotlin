package `26`

fun main() {
    val listaFuncionarios : MutableMap<Int, String> = mutableMapOf(1 to "Ana", 2 to "Priscila")
    val funcionarios : Map<Int, String> = listaFuncionarios
    var credencial : Int = 0
    var nome : String

    do {
        println("Insira a credencial")
        val credencial = readLine()?.toIntOrNull()

        println("Insira o nome")
        val nome = readLine().toString()
    } while (credencial == null && nome.isNullOrEmpty())

//    listaFuncionarios.put(credencial, nome)
}