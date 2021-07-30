programa
{
	
	funcao inicio()
	{
		inteiro segundos, minutos, horas, segundosFinal
		
		escreva("Digite o tempo de duração do evento em segundos: ")
		leia(segundos)

		horas = segundos / 3600
		minutos = (segundos % 3600) / 60
		segundosFinal = (segundos % 3600) % 60

		escreva("\nA duração do evento é de ", horas, " hora(s), ", minutos, " minuto(s), ", segundosFinal, " segundo(s).")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 288; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */