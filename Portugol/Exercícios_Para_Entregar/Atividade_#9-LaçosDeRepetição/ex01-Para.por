programa {
/*
 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário 
 * e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00. 

 */


	inclua biblioteca Matematica --> mat
	
	funcao inicio() {
		inteiro habitantes, filhos, cont, somafilhos=0, ate100=0
		real somasalarios=0.0, salario, maiorsalario=0.0, mediasalario, porcentagem, mediafilhos

		escreva("Digite o número de habitantes: ")
		leia(habitantes)
		
		para(cont=1; cont <= habitantes; cont++) {
			limpa()
			escreva("Digite o salário do habitante ", cont, ": R$")
			leia(salario)
			escreva("Digite o número de filhos do habitante ", cont, ": ")
			leia(filhos)

			somasalarios += salario
			somafilhos += filhos

			se(salario > maiorsalario) {
				maiorsalario = salario
			}
			se(salario <= 100) {
				ate100++
			}
		}

		mediasalario = somasalarios / habitantes
		mediafilhos = somafilhos / habitantes
		porcentagem = ate100 * 100 / habitantes

		limpa()
		escreva("A média do salário da população é igual a R$", mat.arredondar(mediasalario, 2))
		escreva("\nA média do número de filhos da população é igual a ", mediafilhos, " filhos.")
		escreva("\nO maior salário da população é de R$", maiorsalario)
		escreva("\nO percentual de pessoas que recebem até R$100 é de ", porcentagem, "%.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 535; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */