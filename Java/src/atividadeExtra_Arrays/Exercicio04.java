package atividadeExtra_Arrays;

import java.util.Scanner;

/*
 * 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser 
lido e o resultado da adição da constante deve ser armazenado na própria matriz.
 */
public class Exercicio04 {

	public static void main(String[] args) {
		int mat1 [][] = new int[2][2], mat2 [][] = new int[2][2], mat3 [][] = new int[2][2];
		int opcao;
		
//Colocar 'ler' como um objeto da classe Scanner		
		Scanner ler = new Scanner(System.in);
		
		for(int linha=0; linha < 2; linha++) {
			for(int coluna=0; coluna < 2; coluna++) {
				System.out.printf("Número da Matriz 1 [%d][%d]: ", linha, coluna);
				mat1[linha][coluna] = ler.nextInt();
				
				System.out.printf("Número da Matriz 2 [%d][%d]: ", linha, coluna);
				mat2[linha][coluna] = ler.nextInt();
			}
		}
		
		System.out.println("\nMenu de Opções:");
		System.out.println("(1) Somar as duas matrizes \r\n"
				+ "(2) Subtrair a primeira matriz da segunda \r\n"
				+ "(3) Adicionar uma constante as duas matrizes\r\n"
				+ "(4) Imprimir as matrizes ");
		
		System.out.print("\nDigite a opção desejada: ");
		opcao = ler.nextInt();
		
		while(opcao < 1 || opcao > 4) {
			System.out.println("Opção inválida!!\n");
			System.out.print("Digite a opção desejada: ");
			opcao = ler.nextInt();
		}
		
		System.out.println();
		
		if(opcao == 1) {
			System.out.println("Matriz 3(Soma):");
			for(int linha=0; linha < 2; linha++) {
				for(int coluna=0; coluna < 2; coluna++) {
					mat3[linha][coluna] = mat1[linha][coluna] + mat2[linha][coluna];
					System.out.printf("[%d] ", mat3[linha][coluna]);
				}
				System.out.println();
			}
		} else if(opcao == 2) {
			System.out.println("Matriz 3(Subtração):");
			for(int linha=0; linha < 2; linha++) {
				for(int coluna=0; coluna < 2; coluna++) {
					mat3[linha][coluna] = mat1[linha][coluna] - mat2[linha][coluna];
					System.out.printf("[%d] ", mat3[linha][coluna]);
				}
				System.out.println();
			}
		} else if(opcao == 3) {
			for(int linha=0; linha < 2; linha++) {
				for(int coluna=0; coluna < 2; coluna++) {
					System.out.printf("Número a adicionar na posição[%d][%d]: ", linha, coluna );
					int numero = ler.nextInt();
					mat1[linha][coluna] += numero;
					mat2[linha][coluna] += numero;
				}
			}
			System.out.println("\nMatriz 1:");
			for(int linha=0; linha < 2; linha++) {
				for(int coluna=0; coluna < 2; coluna++) {	
					System.out.printf("[%d] ", mat1[linha][coluna]);
				}
				System.out.println();
			}
			System.out.println("\nMatriz 2:");
			for(int linha=0; linha < 2; linha++) {
				for(int coluna=0; coluna < 2; coluna++) {	
					System.out.printf("[%d] ", mat2[linha][coluna]);
				}
				System.out.println();
			}
		} else {
			System.out.println("Matriz 1:");
			for(int linha=0; linha < 2; linha++) {
				for(int coluna=0; coluna < 2; coluna++) {
					System.out.printf("[%d] ", mat1[linha][coluna]);
				}
				System.out.println();
			}
			System.out.println("\nMatriz 2:");
			for(int linha=0; linha < 2; linha++) {
				for(int coluna=0; coluna < 2; coluna++) {
					System.out.printf("[%d] ", mat2[linha][coluna]);
				}
				System.out.println();
			}
		}
	}

}
