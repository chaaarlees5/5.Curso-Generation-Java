programa
{
	inclua biblioteca Matematica --> mat
/*	
 	3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */
	funcao inicio()
	{
		real n1, n2, n3, n4, n1q, n2q, n3q, n4q

		escreva("\nDigite o primeiro número: ")
		leia(n1)
		escreva("\nDigite o segundo número: ")
		leia(n2)
		escreva("\nDigite o terceiro número: ")
		leia(n3)
		escreva("\nDigite o quarto número: ")
		leia(n4)

		n1q = mat.potencia(n1, 2.0)
		n2q = mat.potencia(n2, 2.0)
		n3q = mat.potencia(n3, 2.0)
		n4q = mat.potencia(n4, 2.0)

		se(n3q >= 1000) {
			limpa()
			escreva("O valor do terceiro número elevado ao quadrado é de ", mat.arredondar(n3q, 2))
		} senao {
			limpa()
			escreva("1 - O número ", n1, " elevado ao quadrado é igual a ", mat.arredondar(n1q, 2))
			escreva("\n2 - O número ", n2, " elevado ao quadrado é igual a ", mat.arredondar(n2q, 2))
			escreva("\n3 - O número ", n3, " elevado ao quadrado é igual a ", mat.arredondar(n3q, 2))
			escreva("\n4 - O número ", n4, " elevado ao quadrado é igual a ", mat.arredondar(n4q, 2)) 
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 722; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */