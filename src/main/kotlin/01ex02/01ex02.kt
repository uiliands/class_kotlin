package `01ex02`

fun main() {
    val agenda = Agenda()
    val joao = Contato("Joao", "2344-2432")
    val joao2 = Contato("Joao", "3459-2432")
    val jorge = Contato("Jorge", "2135-3256")
    agenda.salvarContato(joao)
    agenda.salvarContato(joao2)
    agenda.salvarContato(jorge)

    agenda.salvarContato(joao)

    agenda.buscarContato(joao)

    agenda.removerContato(jorge)

    agenda.mostrarAgenda()
}