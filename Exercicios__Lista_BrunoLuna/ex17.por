programa
{	
	funcao inicio() {
		inteiro c=1, num, contador=0
		
		enquanto(c <= 2) {
			escreva("Digite o ", c, "° número: ")
			leia(num)
			
			se(num >= 10 e num <= 150) {
				contador++
			}
			
			c++
		}
		
		limpa()
		escreva("A quantidade de números que estão no intervalo de 10 a 150 é igual a ", contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 84; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */