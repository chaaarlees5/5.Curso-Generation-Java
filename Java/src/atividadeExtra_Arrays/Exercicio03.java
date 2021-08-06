package atividadeExtra_Arrays;

import java.util.Scanner;

//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

public class Exercicio03 {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		int somaMaiores=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int linha=0; linha < 3; linha++) { //Gerar Matriz:
			for(int coluna=0; coluna < 3; coluna++) {
				System.out.print("Entre com o número: ");
				matriz[linha][coluna] = ler.nextInt(); 
	
				if(matriz[linha][coluna] > 10) {
					somaMaiores++;
				}
			}
		}
		System.out.println();

		for(int linha=0; linha < 3; linha++) { //Imprimir Matriz:
			for(int coluna=0; coluna < 3; coluna++) {
				System.out.printf("[%d]", matriz[linha][coluna]);
			}
			System.out.println();
		}
		
		System.out.printf("\nQuantidade de números maiores que dez: %d números", somaMaiores);
	}
}