package Atividade12_IntroducaoJava;
/*
 * 2. Faça um sistema que leia a idade de uma pessoa expressa em
 *  dias e mostre-a expressa em anos, meses e dias. 
 */
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int anos, meses, dias, totalDias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite quantos dias você tem: ");
		totalDias = ler.nextInt();
		
		anos = totalDias / 365;
		meses = (totalDias % 365) / 30;
		dias = (totalDias % 365) % 30;
		
		System.out.print("\nVocê tem " + anos + " ano(s), " + meses + " mes(es) e " + dias + " dia(s).");

	}

}
