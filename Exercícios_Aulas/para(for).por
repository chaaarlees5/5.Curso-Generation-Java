programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real n1, n2, n3, media, somamedia=0.0, mediageral
		inteiro x

		//para(inicialização; comparação; incremento)
		para(x=1; x <= 4; x++) { 
			escreva("Alune ", x, " - Entre com N1: ")
			leia(n1)
			escreva("\nAlune ", x, " - Entre com N2: ")
			leia(n2)
			escreva("\nAlune ", x, " - Entre com N3: ")
			leia(n3)

			limpa()
			media = (n1 + n2 + n3) / 3
			escreva("Média alune ", x, ": ", mat.arredondar(media, 2), "\n\n")

			somamedia += media
		}

		mediageral = somamedia / 4
		
		escreva("A média geral dos alunes é ", mat.arredondar(mediageral, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 272; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */