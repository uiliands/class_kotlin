Algoritmo "04ex01"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Huelton Santos
// Descri��o   : CRIE UM PROGRAMA PARA DETERMINAR SE UMA PESSOA EST� APTA
//PARA DIRIGIR UM CARRO DE UMA EMPRESA DA LOCADORA.
//VOC� DEVE SOLICITAR A ENTRADA DE DADOS: NOME, IDADE, HABILITADO
//- SE A PESSOA � MAIOR DE IDADE E SE TEM CARTEIRA DE HABILITA��O
//- VERIFICAR A CONDI��O
//- SE ATENDE A TODOS OS REQUISITOS, INFORMAR: �LIBERA��O REALIZADA PARA �,
//NOME
//- SENAO INFORMAR QUE �O CLIENTE �,NOME, � N�O ATENTE A TODOS OS REQUISITOS.
// Autor(a)    : Uilian Dias Kumagai
// Data atual  : 14/01/2021
Var
// Se��o de Declara��es das vari�veis
 nome, habilitado: caracter
 idade: inteiro
 habilitacao: logico

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
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
  escreval("Libera��o realizada para ", nome,Carac(124))
 senao
  escreval("O cliente ", nome, " n�o atende a todos os requisitos obrigat�rios",Carac(124))
 fimse

Fimalgoritmo