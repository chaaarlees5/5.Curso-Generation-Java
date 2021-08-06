programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		real fabrica, distribuidor, impostos, consumidor
		
		escreva("Consulte aqui o custo do automóvel ao consumidor")
		escreva("\n\nQual é o valor de custo de fábrica do veículo? R$")
		leia(fabrica)

		distribuidor = fabrica * 28 / 100
		impostos = fabrica * 45 / 100

		//custoc = custof (custof * 0.73)

		consumidor = fabrica + distribuidor + impostos

		escreva("\nO custo do automóvel ao consumidor é de R$", mat.arredondar(consumidor, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */