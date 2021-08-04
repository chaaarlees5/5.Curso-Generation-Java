package atividade16_LacosRepeticao;

import java.util.Scanner;

/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
 *  Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */
public class Exercicio03 {

	public static void main(String[] args) {
		int idade, x=1, cont21=0, cont50=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Descubra quantas pessoas possuem menos de 21 anos e quantas possuem mais de 50 anos.");
		
		System.out.printf("\nDigite a idade da %d° pessoa: ", x);
		idade = ler.nextInt();
		
		while(idade != -99) {
			x++;
			
			if(idade < 21 && idade > 0) {
				cont21++;
			} else if(idade > 50) {
				cont50++;
			}
			System.out.printf("Digite a idade da %d° pessoa (-99 para finalizar): ", x);
			idade = ler.nextInt();
		}
		System.out.println("\nNúmero de pessoas com menos de 21 anos: " + cont21);
		System.out.print("Número de pessoas com mais de 50 anos: " + cont50);
	}

}
