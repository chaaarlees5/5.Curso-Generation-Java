package atividade15_LacosDecisao;

import java.util.Scanner;

/*
Faça um programa que receba a idade de uma pessoa e mostre na saída em qual 
categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
 */
public class Exercicio03 {

	public static void main(String[] args) {
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Descubra qual a sua categoria (Infantil / Juvenil / Adulto)");
		System.out.print("\nDigite a sua idade: ");
		idade = ler.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.print("\nVocê está na categoria Infantil.");
		} else if(idade >= 15 && idade <= 17) {
			System.out.print("\nVocê está na categoria Juvenil.");
		} else if(idade >= 18 && idade <= 25) {
			System.out.print("\nVocê está na categoria Adulto.");
		} else {
			System.out.print("\nA sua idade não possui categoria correspondente.");
		}
	}

}
