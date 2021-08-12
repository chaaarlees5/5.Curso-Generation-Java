package aulasJava;

public class Excecao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = null;
		String novaFrase = null;
		
		try { //ele vai tentar executar uma sequência de códigos que estão dentro da sua estrutura.
			novaFrase = frase.toUpperCase(); 
			//Caso tenha algum problema de execução ele chama o catch para executar
		} catch(NullPointerException e) {
			//Tratamento da Exceção
			System.out.println("A frase inicial está nula, para solucionar o problema, "
					+ "foi lhe atribuido um valor de Default...");
			frase = "Frase vazia";
			
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("\nFrase antiga: " + frase);
		System.out.println("\nFrase Nova: " + novaFrase);
	}

}
