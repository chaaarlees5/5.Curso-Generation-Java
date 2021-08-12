package aulasJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {
//Demonstrar o lan�amento de uma exce��o quando ocorre uma divis�o por 0
	
	public static int quociente(int numerador, int denominador) throws ArithmeticException {
		return numerador / denominador;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		boolean continueLoop = true;
		
		do {
			try { //L� dois n�meros e calcula o quociente
				System.out.print("\nEntre com o n�merador: ");
				int numerador = ler.nextInt();
				System.out.print("\nEntre com o denominador: ");
				int denominador = ler.nextInt();
				
				int resultado = quociente(numerador, denominador);
				System.out.printf("\nResultado: %d / %d = %d", numerador, denominador, resultado);
				
				continueLoop = false;
			} 
			catch(InputMismatchException inputMismatchException) {
				System.err.printf("\nException: %s", inputMismatchException); //'err' 
				ler.nextLine();
				System.out.println("\nVoc� deve entrar com um valor do tipo Inteiro"
						+ "\nPor favor, tente novamente...");
			}
			catch(ArithmeticException arithmeticException) {
				System.err.printf("\nException: %s", arithmeticException); //'err' 
				ler.nextLine();
				System.out.println("\nZero � um denominador inv�lido"
						+ "\nPor favor, tente novamente...");
			}
		} while(continueLoop);
	}

}
