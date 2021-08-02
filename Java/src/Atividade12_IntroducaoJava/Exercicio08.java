package Atividade12_IntroducaoJava;
/*
 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor 
 * e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
 */
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		float fabrica;
		double consumidor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Consulte aqui o custo do automóvel ao consumidor");
		System.out.print("\nQual é o valor de custo de fábrica do veículo? R$");
		fabrica = ler.nextFloat();
		/*
		distribuidor = fabrica * 28 / 100;
		*impostos = fabrica * 45 / 100;
		consumidor = fabrica + distribuidor + impostos;
		*/
		consumidor = fabrica + (fabrica * 0.73);

		System.out.printf("\nO custo do automóvel ao consumidor é de R$%.2f", consumidor);
		
	}

}
