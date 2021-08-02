package Atividade12_IntroducaoJava;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		float a, b, c, d, e, f, x, y;

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Descubra o valor de 'x' e 'y' do sistema de equações lineares a seguir:");
		System.out.println("ax + by = c");
		System.out.println("dx + ey = f");

		System.out.print("\nDigite o valor de 'a': ");
		a = ler.nextFloat();
		System.out.print("Digite o valor de 'b': ");
		b = ler.nextFloat();
		System.out.print("Digite o valor de 'c': ");
		c = ler.nextFloat();
		System.out.print("Digite o valor de 'd': ");
		d = ler.nextFloat();
		System.out.print("Digite o valor de 'e': ");
		e = ler.nextFloat();
		System.out.print("Digite o valor de 'f': ");
		f = ler.nextFloat();

		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);

		System.out.printf("\n\nO valor de 'x' é de %.2f", x);
		System.out.printf("\nO valor de 'y2' é de %.2f", y);
	}

}
