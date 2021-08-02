package Atividade12_IntroducaoJava;

import java.util.Scanner;

/*
 * 4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule
 *  a seguinte expressão: D = (R + S) / 2, onde R = (A + B)² e S = (B + C)²
 */
public class Exercicio04 {

	public static void main(String[] args) {
		int a, b, c;
		double d, r, s;

		System.out.println("Descubra o valor de D na seguinte expressão: D = (R + S) / 2");
		System.out.println("Sabemos que: R = (A + B)² e S = (B + C)²");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("\nDigite o valor de a: ");
		a = ler.nextInt();
		System.out.print("Digite o valor de b: ");
		b = ler.nextInt();
		System.out.print("Digite o valor de c: ");
		c = ler.nextInt();
		
		r = Math.pow(a+b, 2);
		s = Math.pow(b+c, 2);

		d = (r + s) / 2;

		System.out.print("\nO valor de D é igual a " + d);
		
	}

}
