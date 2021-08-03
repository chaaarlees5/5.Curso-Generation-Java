package atividade15_LacosDecisao;
//Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;
//Faça um programa que entre com três números e coloque em ordem crescente.

public class Exercicio02 {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro número: ");
		num1 = ler.nextInt();
		System.out.print("Entre com o segundo número: ");
		num2 = ler.nextInt();
		System.out.print("Entre com o terceiro número: ");
		num3 = ler.nextInt();
		
		if(num1 <= num2 && num1 <= num3) {
			if(num2 <= num3) {
				System.out.print("\nA ordem dos números é: " + num1 + ", " + num2 + ", " + num3 + ".");
			} else {
				System.out.print("\nA ordem dos números é: " + num1 + ", " + num3 + ", " + num2 + ".");
			}
		} else if(num2 <= num3 && num2 <= num1) {
			if(num1 <= num3) {
				System.out.print("\nA ordem dos números é: " + num2 + ", " + num1 + ", " + num3 + ".");
			} else {
				System.out.print("\nA ordem dos números é: " + num2 + ", " + num3 + ", " + num1 + ".");
			}
		} else {
			if(num1 <= num2) {
				System.out.print("\nA ordem dos números é: " + num3 + ", " + num1 + ", " + num2 + ".");
			} else {
				System.out.print("\nA ordem dos números é: " + num3 + ", " + num2 + ", " + num1 + ".");
			}
		}
		
	}

}
