package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Lists {
	public static void main(String[] args) {
		int opcao;
		
		Scanner ler = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n\t\tLoja do Charlin - Estoque");
			System.out.println("------------------------------------------------");
			System.out.println("\n(1) Adicionar itens ao estoque?" + 
								"\n(2) Remover itens do estoque?" +
								"\n(3) Atualizar itens do estoque" + 
								"\n(4) Mostrar itens do estoque" +
								"\n(0) Encerrar");
			System.out.print("\nDigite uma opção: ");
			opcao = ler.nextInt();
			
			switch(opcao) {
			case 1:
				ler.nextLine();
				System.out.print("\n*\tCalça\t\t* \n*\tBlusa\t\t* \n*\tShorts\t\t* \n*\tCamiseta\t* "
									+ "\nDigite o item que deseja adicionar: ");
				String itemAdd = ler.nextLine();
				if(itemAdd.equals("Calça") || itemAdd.equals("Blusa") || itemAdd.equals("Shorts") || itemAdd.equals("Camiseta")) {
					estoque.add(itemAdd);
				} else {
					System.err.println("\nItem inválido.");
				}
				break;
			case 2:
				ler.nextLine();
				System.out.println("\nEstoque: " + estoque);
				System.out.print("Digite o item que deseja remover: ");
				String itemRem = ler.nextLine();
				if(estoque.contains(itemRem)) {
					estoque.remove(itemRem);
				} else {
					System.err.println("\nItem inexistente.");
				}
				break;
			case 3:
				ler.nextLine();
				System.out.print("\nDigite o item que quer atualizar: ");
				String verifica = ler.nextLine();
				System.out.print("\n*\tCalça\t\t* \n*\tBlusa\t\t* \n*\tShorts\t\t* \n*\tCamiseta\t*"
						+ "\nDigite o nome do item que substituirá: ");
				String novo = ler.nextLine();
				if(novo.equals("Calça") || novo.equals("Blusa") || novo.equals("Shorts") || novo.equals("Camiseta")) {
					if(estoque.contains(verifica)) {
						estoque.remove(verifica);
						estoque.add(novo);
					} else {
						System.err.println("\nItem não existe no estoque.");
					}	
				} else {
					System.err.println("\nItem para adicionar inválido.");
				}
				break;
			case 4:
				System.out.println("\nItens do estoque: ");
				System.out.println("\n" + estoque);
				break;
			case 0:
				System.out.println("\nPrograma encerrado!");
				break;
			default:
				System.err.println("\nOpção inválida!");
			}
		} while(opcao != 0);
	}
}
