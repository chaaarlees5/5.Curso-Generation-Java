programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias, totalDias

		escreva("Digite a quantidade de dias: ")
		leia(totalDias)

		anos = totalDias / 365
		meses = (totalDias % 365) / 30
		dias = (totalDias % 365) % 30

		escreva("\nVocê tem ", anos, " ano(s), ", meses, " mes(es) e ", dias, " dia(s).")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 244; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */