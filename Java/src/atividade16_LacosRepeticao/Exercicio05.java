package atividade16_LacosRepeticao;

import java.util.Scanner;

/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */
public class Exercicio05 {

	public static void main(String[] args) {
		int numero, x=1, soma=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.printf("Digite o %d� n�mero a ser somado (digite 0 para finalizar): ", x);
			numero = ler.nextInt();
			
			soma += numero;
			x++;
		} while(numero != 0);
		
		System.out.print("\nA soma dos n�meros digitados � igual a " + soma);
	}

}
