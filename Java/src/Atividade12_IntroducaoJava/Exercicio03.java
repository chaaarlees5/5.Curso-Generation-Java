package Atividade12_IntroducaoJava;

import java.util.Scanner;

/*
 * 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em 
 * segundos e mostre-o expresso em horas, minutos e segundos. 
 */
public class Exercicio03 {

	public static void main(String[] args) {
		int segundos, minutos, horas, segundosFinal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o tempo de dura��o do evento em segundos: ");
		segundos = ler.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundosFinal = (segundos % 3600) % 60;
		
		System.out.print("\nA dura��o do evento � de " + horas + " hora(s), " + minutos + " minuto(s), " + segundosFinal + " segundo(s).");
	}

}
