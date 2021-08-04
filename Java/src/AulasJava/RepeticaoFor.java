package AulasJava;

import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		float n1, n2, n3, media, mediaGeral, somaMedia=0;
		int x;
		
		Scanner ler = new Scanner(System.in);
		
		for(x=1; x <= 5; x++) {
			System.out.print("Entre com a primeira nota: ");
			n1 = ler.nextFloat();
			System.out.print("Entre com a segunda nota: ");
			n2 = ler.nextFloat();
			System.out.print("Entre com a terceira nota: ");
			n3 = ler.nextFloat();
			
			media = (n1+n2+n3) / 3;
			System.out.printf("\nMédia: %2.2f", media);
			
			if(media >=7 && media <= 10) {
				System.out.print("\nAlune aprovade...");
			} else if(media >= 5 && media < 7) {
				System.out.print("\nAlune de exame...");
			} else {
				System.out.print("\nAlune reprovade...");
			}
			
			somaMedia += media;
		}
		
		mediaGeral = somaMedia / 5;
		System.out.printf("\n\nMedia Geral: %2.2f", mediaGeral);

	}

}
