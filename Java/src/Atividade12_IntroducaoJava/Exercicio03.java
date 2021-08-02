package Atividade12_IntroducaoJava;

import java.util.Scanner;

/*
 * 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em 
 * segundos e mostre-o expresso em horas, minutos e segundos. 
 */
public class Exercicio03 {

	public static void main(String[] args) {
		int segundos, minutos, horas, segundosFinal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o tempo de duração do evento em segundos: ");
		segundos = ler.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundosFinal = (segundos % 3600) % 60;
		
		System.out.print("\nA duração do evento é de " + horas + " hora(s), " + minutos + " minuto(s), " + segundosFinal + " segundo(s).");
	}

}
