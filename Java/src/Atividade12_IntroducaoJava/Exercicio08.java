package Atividade12_IntroducaoJava;
/*
 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor 
 * e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
 */
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		float fabrica;
		double consumidor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Consulte aqui o custo do autom�vel ao consumidor");
		System.out.print("\nQual � o valor de custo de f�brica do ve�culo? R$");
		fabrica = ler.nextFloat();
		/*
		distribuidor = fabrica * 28 / 100;
		*impostos = fabrica * 45 / 100;
		consumidor = fabrica + distribuidor + impostos;
		*/
		consumidor = fabrica + (fabrica * 0.73);

		System.out.printf("\nO custo do autom�vel ao consumidor � de R$%.2f", consumidor);
		
	}

}
