programa
{
/*
 * 2- Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 até ele. 
 * Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
 */
	
	funcao inicio()
	{
		inteiro num, soma=0, cont=1

		escreva("Digite um número: ")
		leia(num)

		faca {
			soma += cont // soma = soma + cont
			cont++ // cont = cont + 1
		} enquanto(cont <= num)

		limpa()
		escreva("A soma de todos os números até o número ", num, " é igual a ", soma)

	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */