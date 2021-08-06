package atividadeExtra_Arrays;

import java.util.Scanner;

/*
 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
	� Os n�meros pares digitados;  
	� A soma dos n�meros pares digitados; 
	� Os n�meros �mpares digitados; 
	� A quantidade de n�meros �mpares digitados.
 */
public class Exercicio02 {

	public static void main(String[] args) {
		int vetor[] = new int[6], somaPar=0, qtdImpar=0;
		String pares="", impares="";
	
		Scanner ler = new Scanner(System.in); //Colocar 'ler' como um objeto da classe Scanner

		for(int pos=0; pos < 6; pos++) { //Gerar vetor de 6 posi��es.
			System.out.printf("Digite o %d� n�mero: ", pos+1);
			vetor[pos] = ler.nextInt(); //Atribui o valor digitado na posi��o em que o vetor est�.
			
			if(vetor[pos] % 2 == 0) { //Verifica se o valor � par.
				pares += vetor[pos] + "\t"; //Acrescenta na String 'pares' o valor do vetor na posi��o em que est� e d� um espa�o
				somaPar += vetor[pos]; //Soma todos os valores pares
			} else {
				impares += vetor[pos] + "\t"; ////Acrescenta na String 'impares' o valor do vetor na posi��o em que est� e d� um espa�o
				qtdImpar++; //Contabiliza todos os valores impares
			}
		}
	
		System.out.println("\nN�meros pares digitados: " + pares);
		System.out.println("\nSoma dos n�meros pares: " + somaPar);
		System.out.println("\nN�meros �mpares digitados: " + impares);
		System.out.println("\nQuantidade dos n�meros �mpares: " + qtdImpar);
	}
}
