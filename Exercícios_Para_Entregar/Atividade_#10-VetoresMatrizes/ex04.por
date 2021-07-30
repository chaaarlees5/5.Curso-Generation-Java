programa {
/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba 
 * a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */


	funcao inicio() {
		inteiro matriz[3][3], linha, coluna, soma=0, somaDiagonal, x=1

		para(linha=0; linha < 3; linha++) {
			//Criando Matriz
			para(coluna=0; coluna < 3; coluna++) {
				escreva("Digite o ", x, "° valor: ")
				leia(matriz[linha][coluna])

				soma += matriz[linha][coluna]
				x++
			}
		}
		
		somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2]

		limpa()
		escreva("A soma de todos os valores é igual a ", soma)
		escreva("\nA soma da diagonal principal é igual a ", somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 742; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */