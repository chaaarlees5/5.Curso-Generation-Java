package atividade17_OrientacaoObjetos;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Cliente c1[] = new Cliente[3]; 
		
		for(int x=0; x < 3; x++) {
			c1[x] = new Cliente(null, null, 0, 0, 0, 0);
		}
		
		int x=1;
		for(Cliente varredura:c1) {
			System.out.printf("\nQual é o %d° animal: ", x);
			varredura.setAnimal(ler.next());
			System.out.print("Digite o nome do animal: ");
			varredura.setNome(ler.next());
			System.out.print("Digite o peso do animal: ");
			varredura.setPeso(ler.nextFloat());
			System.out.print("Digite o idade do animal: ");
			varredura.setIdade(ler.nextInt());
			x++;
		}
		/*
		for(int x=0; x < 3; x++) {
			System.out.printf("Qual é o animal: ");
			c1[x].setAnimal(ler.next());
			System.out.print("Digite o nome do animal: ");
			c1[x].setNome(ler.next());
			System.out.print("Digite o peso do animal: ");
			c1[x].setPeso(ler.nextFloat());
			System.out.print("Digite o idade do animal: ");
			c1[x].setIdade(ler.nextInt());

		}*/
		
		x = 1;
		for(Cliente varredura:c1) {
			varredura.imprimirInfo(x);
			x++;
		}
	}

}
