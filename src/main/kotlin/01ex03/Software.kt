package `01ex03`

import java.util.*
import kotlin.collections.ArrayList

class Software {
    val funcionarios = ArrayList<Funcionario>()

    fun salvarDados() {
        val funcionario: Funcionario
        println("Digite matricula do funcionario")
        val id = Scanner(System.`in`).nextInt()
        println("Digite nome do funcionario")
        val nome = Scanner(System.`in`).next()
        println("Digite cpf do funcionario")
        val cpf = Scanner(System.`in`).next()
        println("Digite salario do funcionario")
        val salario = Scanner(System.`in`).nextDouble()
        println("Funcionario [g]estor ou [p]rogramador?")
        val cargo = Scanner(System.`in`).next()
        if (cargo == "g") {
            funcionario = Funcionario(id, nome, cpf, salario, "gestor")
        }
        else {
            funcionario = Funcionario(id, nome, cpf, salario, "programador")
        }
        funcionarios.add(funcionario)
        println("Funcionário salvo com sucesso")
    }

    fun pesquisarFunc(id: Int) {
        var posicaoEncontrado: Int = -1
        for (i in funcionarios.indices) {
            if (funcionarios[i].id == id) {
                posicaoEncontrado = i
            }

            if (posicaoEncontrado >= 0) {
                println("Deseja [e]xibir ou [a]lterar salario do colaborador?")
                val opSalario = Scanner(System.`in`).next()
                if (opSalario == "e") {
                    println(funcionarios[posicaoEncontrado].nome)
                }
                else {
                    if (funcionarios[posicaoEncontrado].cargo == "programador") {
                        funcionarios[posicaoEncontrado].salario *= 1.10
                        println(funcionarios[posicaoEncontrado].salario)
                    }
                    else {
                        funcionarios[posicaoEncontrado].salario *= 1.20
                        println(funcionarios[posicaoEncontrado].salario)
                    }
                }
            }
            else {
                println("Funcionario não encontrado")
            }
        }

    }

}