programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real num1, num2, resultado
		caracter operador

		escreva("Digite dois números e um operador(+, -, *, /) para realizar a conta desejada.")

		escreva("\n\nDigite o primeiro número: ")
		leia(num1)
		escreva("Digite o segundo número: ")
		leia(num2)
		escreva("Digite o operador: ")
		leia(operador)

		enquanto(operador != '+' e operador != '-' e operador != '*' e operador != '/') {
			escreva("\nDigite um operador válido: ")
			leia(operador)	
		}

		se(operador == '+') {
			resultado = num1 + num2
			
			limpa()
			escreva(num1, " ", operador, " ", num2, " = ", mat.arredondar(resultado, 2))
		} senao se(operador == '-') {
			resultado = num1 - num2
			
			limpa()
			escreva(num1, " ", operador, " ", num2, " = ", mat.arredondar(resultado, 2))
		} senao se(operador == '*') {
			resultado = num1 * num2
			
			limpa()
			escreva(num1, " ", operador, " ", num2, " = ", mat.arredondar(resultado, 2))
		} senao {
			resultado = num1 / num2
			
			limpa()
			escreva(num1, " ", operador, " ", num2, " = ", mat.arredondar(resultado, 2))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 45; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */