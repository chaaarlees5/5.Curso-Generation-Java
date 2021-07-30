programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		real a, b, c, d, ee, f, x, y

		escreva("Descubra o valor de 'x' e 'y' do sistema de equações lineares a seguir:")
		escreva("\nax + by = c")
		escreva("\ndx + ey = f")

		escreva("\n\nDigite o valor de 'a': ")
		leia(a)
		escreva("\nDigite o valor de 'b': ")
		leia(b)
		escreva("\nDigite o valor de 'c': ")
		leia(c)
		escreva("\nDigite o valor de 'd': ")
		leia(d)
		escreva("\nDigite o valor de 'e': ")
		leia(ee)
		escreva("\nDigite o valor de 'f': ")
		leia(f)

		x = (c * ee - b * f) / (a * ee - b * d)
		y = (a * f - c * d) / (a * ee - b * d)

		escreva("\n\nO valor de 'x' é de ", mat.arredondar(x, 2))
		escreva("\nO valor de 'y2' é de ", mat.arredondar(y, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 701; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */