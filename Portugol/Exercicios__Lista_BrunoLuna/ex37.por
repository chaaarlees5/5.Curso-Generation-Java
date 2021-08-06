programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		cadeia nome
		caracter sexo
		real altura, pesoIdeal
		inteiro idade
	
		escreva("Digite o seu nome: ")
		leia(nome)
		
		escreva("\nOlá ", nome, " digite o seu sexo (M ou F): ")
		leia(sexo)
		escreva("Agora digite a sua altura: ")
		leia(altura)
		escreva("Digite também a sua idade: ")
		leia(idade)

		enquanto(sexo != 'M' e sexo != 'F') {
			limpa()
			escreva("Digite um sexo válido (M ou F): ")
			leia(sexo)
		}

		se(sexo == 'M' e altura > 1.7) {
			se(idade <= 20) {
				pesoIdeal = (72.7 * altura) - 58
			} senao se(idade >= 40) {
				pesoIdeal = (72.7 * altura) - 45
			} senao {
				pesoIdeal = (72.7 * altura) - 53
			}
		} senao se(sexo == 'M' e altura <= 1.7) {
			se(idade <= 40) {
				pesoIdeal = (72.7 * altura) - 50
			} senao {
				pesoIdeal = (72.7 * altura) - 58
			}
		} senao se(sexo == 'F' e altura > 1.5) {
			pesoIdeal = (62.1 * altura) - 44.7
		} senao {
			se(idade >= 35) {
				pesoIdeal = (62.1 * altura) - 45
			} senao {
				pesoIdeal = (62.1 * altura) - 49
			}
		}

		escreva(nome, ", o seu peso ideal é de ", mat.arredondar(pesoIdeal, 2), " kilos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */