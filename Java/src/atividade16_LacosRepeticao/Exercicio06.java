package atividade16_LacosRepeticao;

import java.util.Scanner;

/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
 */
public class Exercicio06 {

	public static void main(String[] args) {
		int numero, x=1, cont3=0, soma3=0, media3;
		
		Scanner ler = new Scanner(System.in);

		do {
			System.out.printf("Digite o %d� n�mero (digite 0 para sair): ", x);
			numero = ler.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				cont3++;
				soma3 += numero;
			}
			x++;
		} while (numero != 0);
		
		if(cont3 > 0) {
			media3 = soma3 / cont3;
			System.out.print("\nM�dia dos n�meros m�ltiplos de 3: " + media3);
		} else {
			media3 = 0;
			System.out.print("\nM�dia dos n�meros m�ltiplos de 3: " + media3);
		}
	}

}
