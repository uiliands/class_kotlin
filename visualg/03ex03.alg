Algoritmo "03ex02"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Huelton Santos
// Descri��o   : - CRIAR UM PROGRAMA PARA VERIFICAR MAIOR NUMERO
//- ENTRAR COM O NUMERO1 , NUMERO2
//- LER OS VALORES
//- SE O NUMERO1 FOR MAIOR QUE NUMERO2 DEVE MOSTRAR VERDADEIRO, SENAO
//MOSTRAR FALSO
//- USAR OPERADORES L�GICOS
// Autor(a)    : Uilian Dias Kumagai
// Data atual  : 13/01/2021
Var
// Se��o de Declara��es das vari�veis
 numero1, numero2: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
 mudacor("azul","frente")
 escreval("------------------------------",Carac(170))
 escreval("Digite o primeiro valor:      ", Carac(124))
 leia(numero1)
 escreval("Digite o segundo valor:       ", Carac(124))
 leia(numero2)
 
 se (numero1 > numero2) entao
  escreval("numero1 > numero2 ?", verdadeiro, Carac(124))
 senao
  escreval("numero1 > numero2 ?", falso, Carac(124))
 fimse

Fimalgoritmo