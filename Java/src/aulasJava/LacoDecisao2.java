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
		System.out.println("\nDigite o número do elogio que quer mandar");
		System.out.println("1 - Você é muito estudioso(a)");
		System.out.println("2 - Vai dar BOOOOOOOOOOM!");
		System.out.println("3 - Você é muito amável");
		System.out.println("4 - Você é muito gentil");
		System.out.print("\nDigite a sua opção: ");
		op = ler.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\n" + nome + ", Você é muito estudioso(a)");
			break;
		case 2:
			System.out.println("\n" + nome + ", Vai dar BOOOOOOOOOOM");
			break;
		case 3:
			System.out.println("\n" + nome + ", Você é muito amável");
			break;
		case 4:
			System.out.println("\n" + nome + ", Você é muito gentil");
			break;
		default:
			System.out.println("\nOpção inválida!!!");
		}
	}

}
