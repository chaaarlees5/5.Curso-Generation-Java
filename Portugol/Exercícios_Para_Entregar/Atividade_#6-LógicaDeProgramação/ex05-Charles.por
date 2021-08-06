programa
{
	
	funcao inicio()
	{
		real nota1, nota2, nota3, media

		escreva("Escreva a nota 1: ")
		leia(nota1)
		escreva("Escreva a nota 2: ")
		leia(nota2)
		escreva("Escreva a nota 3: ")
		leia(nota3)

		nota1 = nota1 * 2
		nota2 = nota2 * 3
		nota3 = nota3 * 5

		media = (nota1 + nota2 + nota3) / 10

		escreva("\nA média das notas é ", media)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */