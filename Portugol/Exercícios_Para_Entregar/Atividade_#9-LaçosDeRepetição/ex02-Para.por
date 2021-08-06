programa
/*
 * 2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três 
 * e que se encontram no conjunto dos números de 1 até 500.
 */
{
	
	funcao inicio()
	{
		inteiro num, somanum=0

		para(num=1; num <= 500; num++) {
			se(num % 3 == 0) {
				somanum += num
			}
		}

		escreva("A soma de todos os números múltiplos de 3 de 1 à 500 é igual a ", somanum)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 405; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */