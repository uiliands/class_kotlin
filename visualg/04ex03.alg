Algoritmo "04ex03"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Huelton Santos
// Descri��o   : CRIE UM PROGRAMA PARA VERIFICAR A TEMPERATURA DE UMA REGI�O:
//VOC� DEVE ENTRADA COM OS DADOS: �ENTRE COM A REGIAO� E OUTRO
//COM �ENTRE COM A TEMPERATURA�
//REGIAO(SUL, SUDESTE, CENTRO-OESTE, NORTE, NORDESTE), TEMPERATURA
//- SE O CLIMA ESTIVER ENTRE MAIOR QUE 0 A 15 DEVE INFORMAR �MUITO
//FRIO NA REGIAO �, REGIAO
//- SE O CLIMA ESTIVER ENTRE 16 A 20 DEVE INFORMAR �FRIO MODERADO
//NA REGIAO �, REGIAO
//- SE O CLIMA ESTIVER ENTRE 21 A 25 DEVE INFORMAR �CLIMA MODERADO
//NA REGIAO �, REGIAO
// Autor(a)    : Uilian Dias Kumagai
// Data atual  : 14/01/2021
Var
// Se��o de Declara��es das vari�veis
 regiao: caracter
 temperatura: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc...
 mudacor("azul","frente")
 escreval("----------------------------------------------",Carac(170))
 escreval("Digite a regi�o:                              ", Carac(124))
 escreval("[sul][sudeste][centro-oeste][norte][nordeste]:", Carac(124))
 leia(regiao)
 escreval("Digite a temperatura:                         ", Carac(124))
 leia(temperatura)

 se (temperatura > 0) e (temperatura <= 15) entao
  escreval("Muito frio na regi�o ", regiao, Carac(124))
 senao
  se (temperatura >= 15) e (temperatura <= 20) entao
   escreval("Frio moderado na na regi�o ", regiao, Carac(124))
 senao
  escreval("Clima moderado na regiao ", regiao, Carac(124))
 fimse
 fimse
 
Fimalgoritmo