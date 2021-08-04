package atividade16_LacosRepeticao;

import java.util.Scanner;

/*
 * Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a cada 
 * uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
	o número de pessoas calmas; 
	o número de mulheres nervosas; 
	o número de homens agressivos; 
	o número de outros calmos;
	o número de pessoas nervosas com mais de 40 anos; 
	o número de pessoas calmas com menos de 18 anos.
 */
public class Exercicio04 {

	public static void main(String[] args) {
		int idade, sexo, traco, x=1, calma=0, nervosa=0, agressivo=0, calmos3=0, calmas18=0, nervoso40=0;
		
		Scanner ler = new Scanner(System.in);

		while(x <= 150) {
			System.out.print("\nDigite a idade da " + x + "° pessoa: ");
			idade = ler.nextInt();
			System.out.print("Digite o sexo da " + x + "° pessoa \n(1 p/ Feminino, 2 p/ Masculino e 3 p/ Outros): ");
			sexo = ler.nextInt();
			System.out.print("Digite o traço da " + x + "° pessoa \n(1 p/ Calmo(a), 2 p/ Nervoso(a) e 3 p/ Agressivo(a)): ");
			traco = ler.nextInt();
			
			if(traco == 1) {
				calma++;
				if(sexo == 3) {
					calmos3++;
				}
				if(idade < 18) {
					calmas18++;
				}
			}
			if(sexo == 1 && traco == 2) {
				nervosa++;
			}
			if(sexo == 2 && traco == 3) {
				agressivo++;
			}
			if(traco == 2 && idade > 40) {
				nervoso40++;
			}
			x++;
		}
		System.out.println("\nNúmero de pessoas calmas: " + calma);
		System.out.println("\nNúmero de mulheres nervosas: " + nervosa);
		System.out.println("\nNúmero de homens agressivos: " + agressivo);
		System.out.println("\nNúmero de Outros calmos: " + calmos3);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: " + nervoso40);
		System.out.println("\nNúmero de pessoas calmas com menos de 18 anos: " + calmas18);
	}

}
