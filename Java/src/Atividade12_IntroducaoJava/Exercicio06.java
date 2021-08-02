package Atividade12_IntroducaoJava;
/*
 * 6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, 
 * P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
 */
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//float x1, x2, y1, y2;
		double distancia, x1, x2, y1, y2;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Descubra o valor de D na seguinte expressão: D = (R + S) / 2");
		System.out.println("Sabemos que: R = (A + B)² e S = (B + C)²");

		System.out.print("\nDigite o valor de x1: ");
		x1 = ler.nextFloat();
		System.out.print("Digite o valor de x2: ");
		x2 = ler.nextFloat();
		System.out.print("Digite o valor de y1: ");
		y1 = ler.nextFloat();
		System.out.print("Digite o valor de y2: ");
		y2 = ler.nextFloat();

		distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));

		System.out.printf("\nA distância é de %.2f", distancia);
	}

}
