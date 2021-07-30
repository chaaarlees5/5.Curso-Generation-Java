programa {
/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os 
 * lançamentos, escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e 
 * apresente também quantas foram as ocorrências da maior pontuação.
 */
	
	funcao inicio() {
		
		inteiro dado[10], x, maior=0, maiorQtd=0, soma=0
		real media
		
		para(x=0; x < 10; x++) {
			escreva("\n", x+1, "° lançamento do dado: ")
			leia(dado[x])
			//para não digitar valores diferentes de 1 a 6.
			enquanto(dado[x] >= 7 ou dado[x] <= 0) {
				escreva("\nValor de dado inválido, digite novamente (1 a 6): ")
				leia(dado[x])
			}
			//Quantidade de vezes do maior valor.
			se(dado[x] == maior) {
				maiorQtd++ 
			}
			//Maior valor e reseta a quantidade de maior valor
			se(dado[x] > maior) {
				maiorQtd = 1
				maior = dado[x]
			}

			soma += dado[x]
		}
		
		media = soma / 10

		limpa()
		escreva("A média dos lançamentos é ", media)
		escreva("\n\nO maior valor foi o número ", maior, ". Ele foi digitado ", maiorQtd, " vez(es).")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 499; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {dado, 10, 10, 4}-{maior, 10, 23, 5}-{maiorQtd, 10, 32, 8}-{x, 10, 20, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */