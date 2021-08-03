package atividade15_LacosDecisao;

import java.util.Scanner;

/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
 *  n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
 *  �mpar exiba o n�mero elevado ao quadrado.
 */
public class Exercicio04 {

	public static void main(String[] args) { 
		int numero;
		double calculado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com um n�mero: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			if(numero < 0) {
				System.out.print("\nO n�mero " + numero + " � par, mas n�o existe raiz quadrada de n�mero negativo.");
			} else {
				calculado = Math.sqrt(numero);
				System.out.printf("\nO n�mero " + numero + " � par e a sua raiz quadrada � %.2f", calculado);
			}
		} else {
			calculado = Math.pow(numero, 2);
			System.out.print("\nO n�mero " + numero + " � �mpar e ele elevado ao quadrado resulta no n�mero " + calculado);
		}
	}

}
