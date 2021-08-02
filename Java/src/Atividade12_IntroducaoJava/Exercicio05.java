package Atividade12_IntroducaoJava;

import java.util.Scanner;
/*
 * 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
 */
public class Exercicio05 {
	public static void main(String[] args) {
	
		float nota1, nota2, nota3, media;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Escreva a nota 1: ");
		nota1 = ler.nextFloat();
		System.out.print("Escreva a nota 2: ");
		nota2 = ler.nextFloat();
		System.out.print("Escreva a nota 3: ");
		nota3 = ler.nextFloat();
	
		nota1 = nota1 * 2;
		nota2 = nota2 * 3;
		nota3 = nota3 * 5;
	
		media = (nota1 + nota2 + nota3) / 10;
	
		System.out.printf("\nA média das notas é " + media);
	}
}
