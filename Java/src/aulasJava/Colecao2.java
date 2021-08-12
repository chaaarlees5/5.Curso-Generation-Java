package aulasJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n\t\tMenu de Opções");
			System.out.println("-------------------------");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?" + 
								"\n(2) Deseja remover produtos do estoque?" +
							"\n(3) Atualizar produtos do estoque" + 
								"\n(4) Mostrar todos os produtos do estoque" +
							"\n(0) Encerrar o programa");
			System.out.println("---------------------------");
			System.out.print("\nDigite uma opção: ");
			op = ler.nextInt();
			
			switch(op) {
			
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
			case 2:
				ler.nextLine();
				System.out.println("Digite um produto para remover do estoque: ");
				String produtor = ler.nextLine();
				if(estoque.contains(produtor)) {
					estoque.remove(produtor);
				} else {
					System.out.println("\nO produto não existe!!!");
				}
				break;
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do produto " + verifica + ": ");;
				String novo = ler.nextLine();
				
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				} else {
					System.out.println("\nProduto não existe no estoque!!!");
				}
				System.out.println("\n" + estoque);
				break;
			case 4:
				System.out.println("\nProdutos do estoque: ");
				System.out.println("\n" + estoque);
				break;
			default:
				System.out.println("\nVocê finalizou o programa!!! Volte sempre!!!");
			}
		} while(op != 0);
		
		
	}

}
