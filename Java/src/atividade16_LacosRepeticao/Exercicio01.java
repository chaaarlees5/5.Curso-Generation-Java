package atividade16_LacosRepeticao;
import java.util.Scanner;

/*
 * Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
 */
public class Exercicio01 {

	public static void main(String[] args) {
		int numero;
		
		Scanner ler = new Scanner(System.in);
		
		for(numero=1000; numero <= 1999; numero++) {
			if(numero % 11 == 5) {
				System.out.println(numero);
			}
		}
	}

}
