package AulasJava;

import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, nota3, media;
		
		//Cria��o do objeto leia do tipo Scanner
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = ler.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = ler.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = ler.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("\nM�dia: " + media);
		System.out.printf("\nM�dia arredondada: %2.2f", media);
		
		//Raiz Quadrada
		nota1 = Math.sqrt(nota2);
		//Pot�ncia
		nota2 = Math.pow(nota3, 3);
		nota3 = nota1 % nota2;
	}

}
