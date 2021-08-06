package atividadeExtra_Arrays;

import java.util.Scanner;

/*
 * 2- Faça um programa que receba 6 números inteiros e mostre: 
	• Os números pares digitados;  
	• A soma dos números pares digitados; 
	• Os números ímpares digitados; 
	• A quantidade de números ímpares digitados.
 */
public class Exercicio02 {

	public static void main(String[] args) {
		int vetor[] = new int[6], somaPar=0, qtdImpar=0;
		String pares="", impares="";
	
		Scanner ler = new Scanner(System.in); //Colocar 'ler' como um objeto da classe Scanner

		for(int pos=0; pos < 6; pos++) { //Gerar vetor de 6 posições.
			System.out.printf("Digite o %d° número: ", pos+1);
			vetor[pos] = ler.nextInt(); //Atribui o valor digitado na posição em que o vetor está.
			
			if(vetor[pos] % 2 == 0) { //Verifica se o valor é par.
				pares += vetor[pos] + "\t"; //Acrescenta na String 'pares' o valor do vetor na posição em que está e dá um espaço
				somaPar += vetor[pos]; //Soma todos os valores pares
			} else {
				impares += vetor[pos] + "\t"; ////Acrescenta na String 'impares' o valor do vetor na posição em que está e dá um espaço
				qtdImpar++; //Contabiliza todos os valores impares
			}
		}
	
		System.out.println("\nNúmeros pares digitados: " + pares);
		System.out.println("\nSoma dos números pares: " + somaPar);
		System.out.println("\nNúmeros ímpares digitados: " + impares);
		System.out.println("\nQuantidade dos números ímpares: " + qtdImpar);
	}
}
