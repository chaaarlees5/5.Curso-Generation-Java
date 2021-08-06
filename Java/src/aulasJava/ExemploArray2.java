package aulasJava;

import java.util.Scanner;

public class ExemploArray2 {

	public static void main(String[] args) {
		int numeros[][] = new int[3][2];
		int contMais10=0, contMenos10=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int linha=0; linha < 3; linha++) {
			for(int coluna=0; coluna < 2; coluna++) {
				System.out.print("Digite um número: ");
				numeros[linha][coluna] = ler.nextInt();
				
				if(numeros[linha][coluna] > 10) {
					contMais10++;
				} else if(numeros[linha][coluna] < 10) {
					contMenos10++;
				} else {
					System.out.println("\nVocê digitou o número 10, não podemos contabilizar.");
				}
			}
		}
			
		for(int linha=0; linha < 3; linha++) {
			for(int coluna=0; coluna < 2; coluna++) {
				if(numeros[linha][coluna] > 10) {	
					System.out.println(numeros[linha][coluna] + " <---- Este número é maior que 10");
				} else if(numeros[linha][coluna] < 10) {	
					System.out.println(numeros[linha][coluna] + " <---- Este número é menor que 10");
				} else {	
					System.out.println(numeros[linha][coluna] + " <---- Este número é igual a 10");
				}
			}
		}
		
		System.out.printf("\nVocê digitou números maiores que dez %d vezes.", contMais10);
		System.out.printf("\nVocê digitou números menores que dez %d vezes.", contMenos10);
	}

}
