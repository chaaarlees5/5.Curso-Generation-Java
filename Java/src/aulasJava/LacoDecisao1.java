package aulasJava;

import java.util.Scanner;

public class LacoDecisao1 {

	public static void main(String[] args) {
		float n1, n2, n3, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Entre com N1: ");
		n1 = ler.nextFloat();
		System.out.print("Entre com N2: ");
		n2 = ler.nextFloat();
		System.out.print("Entre com N3: ");
		n3 = ler.nextFloat();
		
		media = (n1 + n2 + n3) / 3;
		System.out.printf("\nMédia: %2.2f", media);
		
		if(media >= 7 && media <= 10) {
			System.out.print("\nAlune aprovade!!!");
		} else if(media >= 5 && media < 7) {
			System.out.print("\nAlune de exame!!!");
		} else if(media >= 0 && media < 5){
			System.out.print("\nAlune reprovade!!!");
		} else {
			System.out.print("\nNota fora da média correta!!!");
		}
		
	}

}
