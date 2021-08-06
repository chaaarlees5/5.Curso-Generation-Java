programa {
	inclua biblioteca Util
	
	funcao inicio() {
		inteiro matriz[20][20], linha, coluna, mult1, mult2, mult3, mult4, mult5, mult6
		inteiro maior1=0, maior2=0, maior3=0, maior4=0, maior5=0, maior6=0, maiorzao, x=0
		inteiro pos1=0, pos11=0, pos2=0, pos22=0, pos3=0, pos33=0, pos4=0, pos44=0, pos5=0, pos55=0
		inteiro lin1, lin2, lin3, lin4, col1, col2, col3, col4, pos6=0, pos66=0
		
		para(linha=0; linha < 20; linha++) {
			escreva(x, "- ")
			para(coluna=0; coluna < 20; coluna++) {
				matriz[linha][coluna] = Util.sorteia(0, 9)

				escreva("[ ", matriz[linha][coluna], " ]")

				se(coluna == 19) {
					escreva("\n")
				}
			}
			x++
		}

		para(linha=0; linha < 20; linha++) {
			para(coluna=0; coluna < 20; coluna++) {
				se(linha > 2) {
					mult1 = matriz[linha][coluna] * matriz[linha-1][coluna] * 
					matriz[linha-2][coluna] * matriz[linha-3][coluna]

					se(mult1 > maior1) {
						maior1 = mult1
						pos1 = linha
						pos11 = coluna
					}
				}
				se(linha < 17) {
					mult2 = matriz[linha][coluna] * matriz[linha+1][coluna] * 
					matriz[linha+2][coluna] * matriz[linha+3][coluna]	
				
					se(mult2 > maior2) {
						maior2 = mult2
						pos2 = linha
						pos22 = coluna
					}
				}
				se(coluna > 2) {
					mult3 = matriz[linha][coluna] * matriz[linha][coluna-1] * 
					matriz[linha][coluna-2] * matriz[linha][coluna-3]

					se(mult3 > maior3) {
						maior3 = mult3
						pos3 = linha
						pos33 = coluna
					}
				}
				se(coluna < 17) {
					mult4 = matriz[linha][coluna] * matriz[linha][coluna+1] * 
					matriz[linha][coluna+2] * matriz[linha][coluna+3]

					se(mult4 > maior4) {
						maior4 = mult4
						pos4 = linha
						pos44 = coluna
					}
				}
				se(linha > 2 e coluna > 2) {
					mult5 = matriz[linha][coluna] * matriz[linha-1][coluna-1] * 
					matriz[linha-2][coluna-2] * matriz[linha-3][coluna-3]

					se(mult5 > maior5) {
						maior5 = mult5
						pos5 = linha
						pos55 = coluna
					}
				}
				se(linha > 2 e coluna < 17) {
					mult6 = matriz[linha][coluna] * matriz[linha-1][coluna+1] * 
					matriz[linha-2][coluna+2] * matriz[linha-3][coluna+3]

					se(mult6 > maior6) {
						maior6 = mult6
						pos6 = linha
						pos66 = coluna
					}
				}
			}
		}

		se(maior1 >= maior2 e maior1 >= maior3 e maior1 >= maior4 e maior1 >= maior5) {
			maiorzao = maior1
			lin1 = pos1
			lin2 = pos1-1
			lin3 = pos1-2
			lin4 = pos1-3
			col1 = pos11
			col2 = pos11
			col3 = pos11
			col4 = pos11
			
		} senao se(maior2 >= maior3 e maior2 >= maior4 e maior2 >= maior5) {
			maiorzao = maior2
			lin1 = pos2
			lin2 = pos2+1
			lin3 = pos2+2
			lin4 = pos2+3
			col1 = pos22
			col2 = pos22
			col3 = pos22
			col4 = pos22
		} senao se(maior3 >= maior4 e maior3 >= maior5) {
			maiorzao = maior3
			lin1 = pos3
			lin2 = pos3
			lin3 = pos3
			lin4 = pos3
			col1 = pos33
			col2 = pos33-1
			col3 = pos33-2
			col4 = pos33-3
		} senao se(maior4 >= maior5) {
			maiorzao = maior4
			lin1 = pos4
			lin2 = pos4
			lin3 = pos4
			lin4 = pos4
			col1 = pos44
			col2 = pos44+1
			col3 = pos44+2
			col4 = pos44+3
		} senao {
			maiorzao = maior5
			lin1 = pos5
			lin2 = pos5-1
			lin3 = pos5-2
			lin4 = pos5-3
			col1 = pos55
			col2 = pos55-1
			col3 = pos55-2
			col4 = pos55-3
		}
		
		escreva("\nO maior produto de quatro números é o ", maiorzao)
		escreva("\n\n1° número: ", matriz[lin1][col1])
		escreva("\n1° Posição: [ ", lin1, " ][ ", col1, " ]")
		escreva("\n\n2° número: ", matriz[lin2][col2])
		escreva("\n2° posição: [ ", lin2, " ][ ", col2, " ]")
		escreva("\n\n3° número: ", matriz[lin3][col3])
		escreva("\n3° posição: [ ", lin3, " ][ ", col3, " ]")
		escreva("\n\n4° número: ", matriz[lin4][col4])
		escreva("\n4° posição: [ ", lin4, " ][ ", col4, " ]")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 226; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */