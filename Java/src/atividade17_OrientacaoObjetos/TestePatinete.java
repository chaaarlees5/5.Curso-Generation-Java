package atividade17_OrientacaoObjetos;

import java.util.Scanner;

public class TestePatinete {

	public static void main(String[] args) {
		
		Patinete p1 = new Patinete(null, 0, false, 0);
		
		Scanner ler = new Scanner(System.in);
		
		//while(p1.getCor() != "Amarelo" && p1.getCor() != "amarelo" && p1.getCor() != "Rosa" && p1.getCor() != "rosa" && p1.getCor() != "Azul" && p1.getCor() != "azul" && p1.getCor() != "Cinza" && p1.getCor() != "cinza") {
			System.out.print("Cores disponíveis: \n** Amarelo \n** Rosa \n** Azul \n** Cinza \nDigite a cor do patinete: ");
			p1.setCor(ler.next());
		//}
		
		while(p1.getMarca() != 1 && p1.getMarca() != 2) {
			System.out.print("\nMarcas disponíveis: \n** (1) Divoks \n** (2) Scooter \nDigite o número correspondente a marca do patinete: ");
			p1.setMarca(ler.nextInt());
		}
		
			System.out.printf("\nO patinete %s é motorizado? \n(Digite true ou false): ", p1.getMarca());
			p1.setMotor(ler.nextBoolean());	
		
		p1.imprimirInfo();
	}
}
