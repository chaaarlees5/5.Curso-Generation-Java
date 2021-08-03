package atividade15_LacosDecisao;

import java.util.Scanner;

/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este
 *  número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
 *  ímpar exiba o número elevado ao quadrado.
 */
public class Exercicio04 {

	public static void main(String[] args) { 
		int numero;
		double calculado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com um número: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			if(numero < 0) {
				System.out.print("\nO número " + numero + " é par, mas não existe raiz quadrada de número negativo.");
			} else {
				calculado = Math.sqrt(numero);
				System.out.printf("\nO número " + numero + " é par e a sua raiz quadrada é %.2f", calculado);
			}
		} else {
			calculado = Math.pow(numero, 2);
			System.out.print("\nO número " + numero + " é ímpar e ele elevado ao quadrado resulta no número " + calculado);
		}
	}

}
