Algoritmo "03ex02"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Huelton Santos
// Descrição   : - CRIAR UM PROGRAMA PARA VERIFICAR MAIOR NUMERO
//- ENTRAR COM O NUMERO1 , NUMERO2
//- LER OS VALORES
//- SE O NUMERO1 FOR MAIOR QUE NUMERO2 DEVE MOSTRAR VERDADEIRO, SENAO
//MOSTRAR FALSO
//- USAR OPERADORES LÓGICOS
// Autor(a)    : Uilian Dias Kumagai
// Data atual  : 13/01/2021
Var
// Seção de Declarações das variáveis
 numero1, numero2: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
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