programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		inteiro a, b, c
		real d, r, s

		escreva("Descubra o valor de D na seguinte expressão: D = (R + S) / 2")
		escreva("\nSabemos que: R = (A + B)² e S = (B + C)²")
		
		escreva("\n\nDigite o valor de a: ")
		leia(a)
		escreva("Digite o valor de b: ")
		leia(b)
		escreva("Digite o valor de c: ")
		leia(c)
		
		r = mat.potencia((a+b), 2.0)
		s = mat.potencia((b+c), 2.0)

		d = (r + s) / 2

		escreva("\nO valor de D é igual a ", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 105; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */