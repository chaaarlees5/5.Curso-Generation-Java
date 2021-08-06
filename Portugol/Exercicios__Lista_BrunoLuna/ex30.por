programa
{
	
	funcao inicio()
	{
		cadeia nome, sexo
		inteiro idade
		real salFixo, salLiquido
	
		escreva("Olá, qual é o seu nome?\n")
		leia(nome)
		escreva("\nVocê é do sexo masculino ou feminino? Digite 'M' ou 'F'\n")
		leia(sexo)		
		escreva("\nMuito prazer, ", nome, ". Quantos anos você tem?\n")
		leia(idade)
		escreva("\nQual é o seu salário fixo, ", nome, "?\n")
		leia(salFixo)

		se(sexo == "F") {
			se(idade >= 30) {
				salLiquido = salFixo + 200
			} senao {
				salLiquido = salFixo + 80	
			}
			
		} senao {
			se(idade >= 30) {
				salLiquido = salFixo + 100
			} senao {
				salLiquido = salFixo + 50
			}
		}

		escreva("\n\n", nome, ", o seu salário líquido é de R$", salLiquido, ".")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 168; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */