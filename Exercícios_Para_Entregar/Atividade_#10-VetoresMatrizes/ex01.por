programa {
/*
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade 
 * e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
 */
	funcao inicio() {
		
		real notas[5], maior=0.0
		inteiro c
		//Solicita os valores
		para(c=0; c < 5; c++) {

			escreva("Entre com a ", c+1, "° nota: ")
			leia(notas[c])
			//Define maior valor
			se(notas[c] > maior) {
				maior = notas[c]
			}
		}
		
		limpa()
		//Imprime todas as notas e a maior nota
		para(c=0; c < 5; c++) {
			
			escreva("Nota ", c+1, ": ", notas[c], "\n")
		}

		escreva("\nA maior nota é a nota ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 596; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */