package atividade16_LacosRepeticao;
//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int numero, par=0, impar=0, x;
		
		Scanner ler = new Scanner(System.in);

		for(x=1; x <= 10; x++) {
			System.out.print("Digite o n�mero: ");
			numero = ler.nextInt();
			
			if(numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.printf("\nForam digitados %d n�meros pares e %d n�meros �mpares.", par, impar);
	}

}
