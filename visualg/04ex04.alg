Algoritmo "04ex04"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Huelton Santos
// Descrição   : ESCREVA UM PROGRAMA DE CALCULADORA BASICA:
//- ENTRE COM O NUMERO1
//- ENTRE COM O OPERADOR ( / * + - )
//- ENTRE COM O SEGUNDO NUMERO
//CASO O OPERADOR FACA O CALCULO:
//CASO "+"
//RESULTADO <- NUMERO 1 + NUMERO 2
//ESCREVER NA TELA ( NUMERO 1," + ", NUMERO2, " = ", RESULTADO) , ASSIM POR
//DIANTE,
//OUTRO CASO ESCREVER "OPERADOR INVALIDO"
// Autor(a)    : Uilian Dias Kumagai
// Data atual  : 14/01/2021
Var
// Seção de Declarações das variáveis
 operacao: caracter
 numero1, numero2: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
 mudacor("azul","frente")
 escreval("----------------------------------------------",Carac(170))
 escreval("Digite o primeiro número:                     ", Carac(124))
 leia(numero1)
 escreval("Digite o segundo número:                      ", Carac(124))
 leia(numero2)
 escreval("Digite a operacao: [+][-][*][/]               ", Carac(124))
 leia(operacao)

 escolha operacao
 caso "+"
      escreval("Resultado: ", numero1 + numero2)
 caso "-"
      escreval("Resultado: ", numero1 - numero2)
 caso "*"
      escreval("Resultado: ", numero1 * numero2)
 caso "/"
    se (numero2 > 0) entao
      escreval("Resultado: ", numero1 / numero2:2:2)
    senao
      escreval("Não é possível realizar a divisão")
    fimse
  fimescolha
  
Fimalgoritmo