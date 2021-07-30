programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias, totalDias

		escreva("Digite quantos anos você tem: ")
		leia(anos)
		escreva("Digite quantos meses você tem: ")
		leia(meses)
		escreva("Digite quantos dias você tem: ")
		leia(dias)

		totalDias = (anos * 365) + (meses * 30) + dias

		escreva("\nVocê tem ", totalDias, " dias.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */