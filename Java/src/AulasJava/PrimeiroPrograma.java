package AulasJava;

import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, nota3, media;
		
		//Criação do objeto leia do tipo Scanner
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = ler.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = ler.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = ler.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("\nMédia: " + media);
		System.out.printf("\nMédia arredondada: %2.2f", media);
		
		//Raiz Quadrada
		nota1 = Math.sqrt(nota2);
		//Potência
		nota2 = Math.pow(nota3, 3);
		nota3 = nota1 % nota2;
	}

}
