programa
{
/*
 * 1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 3 em 3 
 * quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
 */
	
	funcao inicio() {
		inteiro num=233
		
		escreva(num, "\n")
		
		faca {
			se(num < 300 ou num > 400) {
				num += 5
				escreva(num, "\n")
			} senao {
				num += 3
				escreva(num, "\n")
			}
		} enquanto(num <= 456)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */