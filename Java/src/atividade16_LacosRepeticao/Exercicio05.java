package atividade16_LacosRepeticao;

import java.util.Scanner;

/*
 * Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
 * No final, mostre a soma dos números digitados.(DO...WHILE)
 */
public class Exercicio05 {

	public static void main(String[] args) {
		int numero, x=1, soma=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.printf("Digite o %d° número a ser somado (digite 0 para finalizar): ", x);
			numero = ler.nextInt();
			
			soma += numero;
			x++;
		} while(numero != 0);
		
		System.out.print("\nA soma dos números digitados é igual a " + soma);
	}

}
