package AulasJava;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, contpar=0, somaImpar=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com um número inteiro qualquer: ");
		numero = ler.nextInt();
		
		while(numero != 0) {
			if(numero % 2 == 0) {
				contpar++;
			} else {
				somaImpar += numero;
			}
			System.out.print("Entre com um número inteiro qualquer: ");
			numero = ler.nextInt();
		}
		System.out.println("\nQuantidade de números pares: " + contpar);
		System.out.print("Somatório de números ímpares: " + somaImpar);		
	}

}
