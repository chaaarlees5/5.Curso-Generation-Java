programa {
	
	funcao inicio() {
		real num1, num2
	
		escreva("Escreva o primeiro número: ")
		leia(num1)
		escreva("Escreva o segundo número: ")
		leia(num2)

		se(num1 == num2) {
			escreva("\nOs números digitados são iguais")
		} senao {
			se(num1 > num2) {
				escreva("\nOs números digitados são diferentes")
				escreva("\nO número ", num1, " é maior do que o número ", num2)
			} senao {
				escreva("\nOs números digitados são diferentes")
				escreva("\nO número ", num2, " é maior do que o número ", num1)
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 537; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */