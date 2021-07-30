programa
/*
 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do 
 * somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário 
 * estiver fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
 */
{
	
	funcao inicio() {
		inteiro num, somanum=0, lidos=0
		real media

		escreva("Digite um número (quando for digitado números negativos o programa se encerrará)\n\n")

		escreva("Digite um número: ")
		leia(num)
		
		enquanto(num >= 0) {
			somanum += num //somanum = somanum + num
			lidos++ //lidos = lidos + 1

			limpa()
			escreva("Digite um número (quando for digitado números negativos o programa se encerrará)\n\n")
			escreva("Digite um número: ")
			leia(num)
		}
		media = somanum / lidos

		limpa()
		escreva("Você digitou ", lidos, " números positivos.")
		escreva("\nA soma de todos os números digitados é igual a ", somanum)
		escreva("\nA média de todos os números digitados é igual a ", media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 895; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */