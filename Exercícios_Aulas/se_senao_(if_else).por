programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real nota1, nota2, nota3, media

		escreva("Escreva a nota 1: ")
		leia(nota1)
		escreva("Escreva a nota 2: ")
		leia(nota2)
		escreva("Escreva a nota 3: ")
		leia(nota3)

		nota1 = nota1 * 2
		nota2 = nota2 * 3
		nota3 = nota3 * 5

		media = (nota1 + nota2 + nota3) / 10
		limpa()

		escreva("A média das notas é ", mat.arredondar(media, 2))

		se(media >= 7 e media <= 10) {
			escreva("\n\nVocê está aprovado!") 
		} senao se(media >=5 e media < 7) {
			escreva("\n\nVocê está de exame!")
		} senao se(media >=0 e media < 5) {
			escreva("\n\nVocê está reprovado!")
		} senao {
			escreva("\n\nMédia fora da faixa aceita,")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */