package atividade16_LacosRepeticao;

import java.util.Scanner;

/*
 * Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada 
 * uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 * e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
	o n�mero de pessoas calmas; 
	o n�mero de mulheres nervosas; 
	o n�mero de homens agressivos; 
	o n�mero de outros calmos;
	o n�mero de pessoas nervosas com mais de 40 anos; 
	o n�mero de pessoas calmas com menos de 18 anos.
 */
public class Exercicio04 {

	public static void main(String[] args) {
		int idade, sexo, traco, x=1, calma=0, nervosa=0, agressivo=0, calmos3=0, calmas18=0, nervoso40=0;
		
		Scanner ler = new Scanner(System.in);

		while(x <= 150) {
			System.out.print("\nDigite a idade da " + x + "� pessoa: ");
			idade = ler.nextInt();
			System.out.print("Digite o sexo da " + x + "� pessoa \n(1 p/ Feminino, 2 p/ Masculino e 3 p/ Outros): ");
			sexo = ler.nextInt();
			System.out.print("Digite o tra�o da " + x + "� pessoa \n(1 p/ Calmo(a), 2 p/ Nervoso(a) e 3 p/ Agressivo(a)): ");
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
		System.out.println("\nN�mero de pessoas calmas: " + calma);
		System.out.println("\nN�mero de mulheres nervosas: " + nervosa);
		System.out.println("\nN�mero de homens agressivos: " + agressivo);
		System.out.println("\nN�mero de Outros calmos: " + calmos3);
		System.out.println("\nN�mero de pessoas nervosas com mais de 40 anos: " + nervoso40);
		System.out.println("\nN�mero de pessoas calmas com menos de 18 anos: " + calmas18);
	}

}
