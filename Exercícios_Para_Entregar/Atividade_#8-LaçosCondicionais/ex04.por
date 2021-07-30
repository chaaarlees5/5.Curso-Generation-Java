programa
{
/*
 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, 
 * e se é positivo ou negativo.
 */
	funcao inicio()
	{
		inteiro numero

		escreva("Digite um número e descubra se ele é par ou impar, positivo ou negativo.\n")
		leia(numero)

		se(numero % 2 == 0 e numero > 0) {
			escreva("\nO número digitado é um número par e positivo.")
		} senao se(numero % 2 == 0 e numero < 0) {
			escreva("\nO número digitado é um número par e negativo.")
		} senao se(numero == 0) {
			escreva("\nO número digitado é um número par e nulo.")
		} senao se(numero % 2 != 0 e numero >= 0) {
			escreva("\nO número digitado é um número ímpar e positivo.")
		} senao
			escreva("\nO número digitado é um número ímpar e negativo.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 593; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */