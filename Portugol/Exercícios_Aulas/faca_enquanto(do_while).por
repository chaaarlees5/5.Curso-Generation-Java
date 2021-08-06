programa { 
	
	funcao inicio() { 
	
		inteiro tabuada,y=1,resultado 
		
		escreva("\nDigite a tabuada que quer ver: ") 
		leia(tabuada) // 8 
		
		faca { 
			resultado = tabuada * y 
			
			escreva("\n",tabuada," X ",y, " = ",resultado) 
			
			y++ 
		
		} enquanto(y<=10) 	
	} 
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 273; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */