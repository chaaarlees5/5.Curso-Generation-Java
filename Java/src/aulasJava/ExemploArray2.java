package aulasJava;

import java.util.Scanner;

public class ExemploArray2 {

	public static void main(String[] args) {
		int numeros[][] = new int[3][2];
		int contMais10=0, contMenos10=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int linha=0; linha < 3; linha++) {
			for(int coluna=0; coluna < 2; coluna++) {
				System.out.print("Digite um n�mero: ");
				numeros[linha][coluna] = ler.nextInt();
				
				if(numeros[linha][coluna] > 10) {
					contMais10++;
				} else if(numeros[linha][coluna] < 10) {
					contMenos10++;
				} else {
					System.out.println("\nVoc� digitou o n�mero 10, n�o podemos contabilizar.");
				}
			}
		}
			
		for(int linha=0; linha < 3; linha++) {
			for(int coluna=0; coluna < 2; coluna++) {
				if(numeros[linha][coluna] > 10) {	
					System.out.println(numeros[linha][coluna] + " <---- Este n�mero � maior que 10");
				} else if(numeros[linha][coluna] < 10) {	
					System.out.println(numeros[linha][coluna] + " <---- Este n�mero � menor que 10");
				} else {	
					System.out.println(numeros[linha][coluna] + " <---- Este n�mero � igual a 10");
				}
			}
		}
		
		System.out.printf("\nVoc� digitou n�meros maiores que dez %d vezes.", contMais10);
		System.out.printf("\nVoc� digitou n�meros menores que dez %d vezes.", contMenos10);
	}

}
