Algoritmo "04ex01"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Huelton Santos
// Descrição   : CRIE UM PROGRAMA PARA DETERMINAR SE UMA PESSOA ESTÁ APTA
//PARA DIRIGIR UM CARRO DE UMA EMPRESA DA LOCADORA.
//VOCÊ DEVE SOLICITAR A ENTRADA DE DADOS: NOME, IDADE, HABILITADO
//- SE A PESSOA É MAIOR DE IDADE E SE TEM CARTEIRA DE HABILITAÇÃO
//- VERIFICAR A CONDIÇÃO
//- SE ATENDE A TODOS OS REQUISITOS, INFORMAR: “LIBERAÇÃO REALIZADA PARA ”,
//NOME
//- SENAO INFORMAR QUE “O CLIENTE “,NOME, “ NÃO ATENTE A TODOS OS REQUISITOS.
// Autor(a)    : Uilian Dias Kumagai
// Data atual  : 14/01/2021
Var
// Seção de Declarações das variáveis
 nome, habilitado: caracter
 idade: inteiro
 habilitacao: logico

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
 mudacor("azul","frente")
 escreval("-------------------------------",Carac(170))
 escreval("Digite o nome:                 ", Carac(124))
 leia(nome)
 escreval("Digite a idade:                ", Carac(124))
 leia(idade)
 escreval("Habilitado [s][n]              ", Carac(124))
 leia(habilitado)
 se (habilitado = "s") entao
  habilitacao <- verdadeiro
 senao
  habilitacao <- falso
 fimse
 
 se (idade >= 18) e (habilitacao = verdadeiro) entao
  escreval("Liberação realizada para ", nome,Carac(124))
 senao
  escreval("O cliente ", nome, " não atende a todos os requisitos obrigatórios",Carac(124))
 fimse

Fimalgoritmo