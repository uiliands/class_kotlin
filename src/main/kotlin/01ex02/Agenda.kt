//Crie um programa em Kotlin que tenha a função de ser uma
//agenda de contatos. Essa agenda pode armazenar somente 10 contatos
package `01ex02`

class Agenda {
    val contatos = arrayOfNulls<Contato>(10)

    //Salvar contato: ao inserir o nome e o telefone de uma
    //pessoa e ela não constar na agenda, salva então o seu
    //contato na agenda;
    fun salvarContato(contato: Contato) {
        var contatoExistente: Boolean = false
        //procura se contato existe na lista atual
        for (i in contatos.indices) {
            if (contatos[i]?.equals(contato) == true) {
                contatoExistente = true
                break
            }
        } //endfor

        if (contatoExistente) {
            println("Contato existente")
        }
        else {
            for (i in contatos.indices) {
                //localiza próxima entrada vazia na lista e grava contato
                if (contatos[i] == null) {
                    contatos.set(i, contato)
                    println("Contato " + contato.nome + " salvo")
                    break
                }
            }
        }
    }

//    Remover contato: ao inserir o nome e o telefone de uma
//    pessoa e ela constar na agenda, seu contato é
//    removido. Caso ela não exista, informar ao usuário;
    fun removerContato(contato: Contato) {
        //procura se contato existe na lista atual
        for (i in contatos.indices) {
            if (contatos[i]?.equals(contato) == true) {
                contatos[i] = null
                println("Contato " + contato.nome + " removido")
                break
            }
        } //endfor
    }

//    Buscar contato: ao inserir um nome, retornar seus
//    dados. Se tiver mais de um resultado, exemplo, dois
//    contatos de nome Juliana salvos com telefones
//    diferentes, exibir ambos;
    fun buscarContato(contato: Contato) {
        //procura se contato existe na lista atual
        for (i in contatos.indices) {
            if (contatos[i]?.nome == contato.nome) {
                println(contatos[i]?.nome)
                println(contatos[i]?.tel)
            }
        } //endfor
    }

//    Mostrar agenda completa com todos os contatos
//    salvos.
    fun mostrarAgenda() {
        for (i in contatos.indices) {
            if (contatos[i] != null) {
                println(contatos[i]?.nome)
                println(contatos[i]?.tel)
            }
        }
    }

}

