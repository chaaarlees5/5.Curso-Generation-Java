programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real p, ee = 0.0, m = 0.0 //peso, excesso e multa

		escreva("Informe o peso da carga de tomates: ")
		leia(p)

		se(p <= 50) {
			escreva("\nO peso de ", p, " quilos não ultrapassa o limite estabelecido.")
		} senao {
			ee = p - 50
			m = ee * 4
			escreva("\nO peso da carga ultrapassou o limite estabelecido em ", mat.arredondar(ee, 2), " quilos.")
			escreva("\nVocê deve pagar uma multa de R$", m)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */