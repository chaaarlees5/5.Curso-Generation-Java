package atividade15_LacosDecisao;
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.print("Entre com o segundo n�mero: ");
		num2 = ler.nextInt();
		System.out.print("Entre com o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.print("\nO maior n�mero � o " + num1);
		} else if(num2 >= num3) {
			System.out.print("\nO maior n�mero � o " + num2);
		} else {
			System.out.print("\nO maior n�mero � o " + num3 + ".");
		}
		
	}

}
