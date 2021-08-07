package atividade17_OrientacaoObjetos;

import java.util.Scanner;

public class TestePatinete {

	public static void main(String[] args) {
		Patinete p1 = new Patinete(null, null, false, 0);
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a cor do patinete: ");
		p1.receberCor(ler.nextLine());

		System.out.print("Digite a marca do patinete: ");
		p1.receberMarca(ler.nextLine());
		
		System.out.print("O patinete é motorizado? (Sim ou Não): ");
		p1.receberMotor(ler.nextLine());
		
		p1.imprimirInfo();
	}
}
