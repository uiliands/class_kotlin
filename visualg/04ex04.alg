Algoritmo "04ex04"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Huelton Santos
// Descri��o   : ESCREVA UM PROGRAMA DE CALCULADORA BASICA:
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
// Se��o de Declara��es das vari�veis
 operacao: caracter
 numero1, numero2: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
 mudacor("azul","frente")
 escreval("----------------------------------------------",Carac(170))
 escreval("Digite o primeiro n�mero:                     ", Carac(124))
 leia(numero1)
 escreval("Digite o segundo n�mero:                      ", Carac(124))
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
      escreval("N�o � poss�vel realizar a divis�o")
    fimse
  fimescolha
  
Fimalgoritmo