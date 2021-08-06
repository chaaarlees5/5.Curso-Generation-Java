programa
{
	inclua biblioteca Matematica --> mat
	/*
	Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de 
	um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder 
	a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora 
	excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
	*/
	funcao inicio()
	{
		real n, ee = 0.0, s, eh //numero de horas, excedente(salário), salário, execesso de horas
		cadeia c //código(?)
		
		escreva("Digite o código do operário: ")
		leia(c)
		escreva("Digite o número de horas trabalhadas: ")
		leia(n)

		se(n <= 50) {
			s = n * 10
			limpa()
			
			escreva("O operário ", c, " não possui horas excedentes.")
			escreva("\nO salário do operário é de R$", mat.arredondar(s, 2))
		} senao {
			eh = n - 50
			ee = eh * 20
			s = 500 + ee
			
			limpa()
			escreva("O operário ", c, " possui ", eh, " horas excedentes, gerando um salário excedente de R$", ee)
			escreva("\nO salário total do operário é de R$", s)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 933; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */