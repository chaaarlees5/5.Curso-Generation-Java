package atividade16_LacosRepeticao;
//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int numero, par=0, impar=0, x;
		
		Scanner ler = new Scanner(System.in);

		for(x=1; x <= 10; x++) {
			System.out.print("Digite o número: ");
			numero = ler.nextInt();
			
			if(numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.printf("\nForam digitados %d números pares e %d números ímpares.", par, impar);
	}

}
