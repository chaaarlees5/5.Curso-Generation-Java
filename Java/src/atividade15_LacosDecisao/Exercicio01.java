package atividade15_LacosDecisao;
//Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro número: ");
		num1 = ler.nextInt();
		System.out.print("Entre com o segundo número: ");
		num2 = ler.nextInt();
		System.out.print("Entre com o terceiro número: ");
		num3 = ler.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.print("\nO maior número é o " + num1);
		} else if(num2 >= num3) {
			System.out.print("\nO maior número é o " + num2);
		} else {
			System.out.print("\nO maior número é o " + num3 + ".");
		}
		
	}

}
