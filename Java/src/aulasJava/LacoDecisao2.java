package aulasJava;

import java.util.Scanner;

public class LacoDecisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		String nome;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("\n\t\tMenu de Elogios...");
		System.out.println("\nDigite o n�mero do elogio que quer mandar");
		System.out.println("1 - Voc� � muito estudioso(a)");
		System.out.println("2 - Vai dar BOOOOOOOOOOM!");
		System.out.println("3 - Voc� � muito am�vel");
		System.out.println("4 - Voc� � muito gentil");
		System.out.print("\nDigite a sua op��o: ");
		op = ler.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\n" + nome + ", Voc� � muito estudioso(a)");
			break;
		case 2:
			System.out.println("\n" + nome + ", Vai dar BOOOOOOOOOOM");
			break;
		case 3:
			System.out.println("\n" + nome + ", Voc� � muito am�vel");
			break;
		case 4:
			System.out.println("\n" + nome + ", Voc� � muito gentil");
			break;
		default:
			System.out.println("\nOp��o inv�lida!!!");
		}
	}

}
