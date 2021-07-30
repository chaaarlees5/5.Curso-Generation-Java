programa
{
	
	funcao inicio()
	{	
		inteiro nivel
		real horas, salario
	
		escreva("Calcule o salário do professor")

		escreva("\n\nDigite o número de horas trabalhadas: ")
		leia(horas)
		escreva("Digite o nível do professor(1, 2 ou 3): ")
		leia(nivel)

		enquanto(nivel != 1 e nivel != 2 e nivel != 3) {
			limpa()
			escreva("Digite o nível do professor corretamente(1, 2 ou 3): ")
			leia(nivel)
		}
		
		se(nivel == 1) {
			salario = horas * 12.0
		} senao se(nivel == 2) {
			salario = horas * 17.0
		} senao {
			salario = horas * 25.0
		}
		
		limpa()
		escreva("O salário do professor é de R$",salario)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 139; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */