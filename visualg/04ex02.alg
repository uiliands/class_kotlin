Algoritmo "04ex02"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Huelton Santos
// Descri��o   : CRIAR UM PROGRAMA PARA VALIDAR CLIENTES FIDELIZA��O DO SUPERMERCADO
//EXBRA
//- ENTRAR COM O NOME, SOBRE NOME E RG
//- LER OS VALORES
//- REALIZAR A SAIDA : �BEM VINDO: �, NOME, � � SOBRE NOME�
//- COLOCAR O TEXTO: �VC � PORTADOR DO DOCUMENTO RG : �, RG
//- SE SIM MENSAGEM �PERFEITO !! BOAS COMPRAS�
//- SENAO MENSAGEM �SINTO MUITO, DESCONTO NAO AUTORIZADO!, MAS PODE FAZER
//AS COMPRAS
// Autor(a)    : Uilian Dias Kumagai
// Data atual  : 14/01/2021
Var
// Se��o de Declara��es das vari�veis
 nome, sobrenome, rg, portador: caracter
 portadorConf: logico

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
 mudacor("azul","frente")
 escreval("-------------------------------",Carac(170))
 escreval("Digite o nome:                 ", Carac(124))
 leia(nome)
 escreval("Digite a sobrenome:            ", Carac(124))
 leia(sobrenome)
 escreval("Digite o rg:                   ", Carac(124))
 leia(rg)
 escreval("Bem vindo: ", nome, " ", sobrenome)
 escreval("Voc� � portador do rg : ", rg, "? [s][n]")
 leia(portador)
 se (portador = "s") entao
  portadorConf <- verdadeiro
 senao
  portadorConf <- falso
 fimse

 se (portadorConf) entao
  escreval("Perfeito!! Boas compras. ", nome,Carac(124))
 senao
  escreval("Sinto muito, desconto n�o autorizado, mas pode fazer as compras")
 fimse

Fimalgoritmo