package Atividade12_IntroducaoJava;
/*
 * 1. Fa�a um sistema que leia a idade de uma pessoa expressa em
 *  anos, meses e dias e mostre-a expressa apenas em dias. 
 */
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int anos, meses, dias, totalDias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite quantos anos voc� tem: ");
		anos = ler.nextInt();
		System.out.print("\nDigite quantos meses voc� tem: ");
		meses = ler.nextInt();
		System.out.print("\nDigite quantos dias voc� tem: ");
		dias = ler.nextInt();
		
		totalDias = (anos * 365) + (meses * 30) + dias;
		System.out.print("\nVoc� tem " + totalDias + " dias.");
	}

}
