package aulasJava;

import java.util.Scanner;

public class ExemploArray {

	public static void main(String[] args) {
//'final' serve pra declarar uma constante.
		final int tamanho = 4; 
		float medias[] = new float [tamanho];
		float somaMedia=0, mediaGeral;
		
		Scanner ler = new Scanner(System.in);
		
		for(int pos = 0; pos < 4; pos++) {
			System.out.printf("\nEntre com a sua %d° média: ", pos+1);
			medias[pos] = ler.nextFloat();
			
			somaMedia += medias[pos];
		}
		mediaGeral = somaMedia / 4;
		System.out.printf("\nSua média geral foi de: %2.2f", mediaGeral);
	}

}
