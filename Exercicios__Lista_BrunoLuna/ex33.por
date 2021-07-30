programa
{
	
	funcao inicio()
	{
		inteiro lado1, lado2, lado3, lado12, lado23, lado13
		
		escreva("Digite as medidas do triângulo para saber se o mesmo é Equilátero, Isóscele ou Escaleno.")
	
		escreva("\n\nDigite a primeira medida: ")
		leia(lado1)
		escreva("Digite a segunda medida: ")
		leia(lado2)
		escreva("Digite a terceira medida: ")
		leia(lado3)

		lado12 = lado1 + lado2
		lado13 = lado1 + lado3
		lado23 = lado2 + lado3
		
		enquanto(lado1 >= lado23 ou lado2 >= lado13 ou lado3 >= lado12) {
			limpa()
			escreva("Valores inseridos não correspondem a um triângulo, digite novamente.")

			escreva("\n\nDigite a primeira medida: ")
			leia(lado1)
			escreva("Digite a segunda medida: ")
			leia(lado2)
			escreva("Digite a terceira medida: ")
			leia(lado3)

			lado12 = lado1 + lado2
			lado13 = lado1 + lado3
			lado23 = lado2 + lado3
		}

		se(lado1 == lado2 e lado1 == lado3) {
			escreva("\nEste é um Triângulo Equilátero e Isóscele.")
		} senao se((lado1 == lado2 e lado1 != lado3) ou 
				(lado1 == lado3 e lado1 != lado2) ou 
				(lado2 == lado3 e lado2 != lado1)) {
			escreva("\nEste é um Triângulo Isóscele.")
		} senao {
			escreva("\nEste é um Triângulo Escaleno.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */