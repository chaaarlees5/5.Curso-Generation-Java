package aulasJava;

public class POO1TesteAutomovel {
	
	public static void main(String[] args) {
		// Instanciando um Objeto da Classe POOAutomovel
		
		POO1Automovel terrivel = new POO1Automovel("Alysson Rodrigo", "Porsche", "GNB-1404", 2021);
		// Troca de mensagens
		terrivel.imprimirInfo();
		
		System.out.println("\n\n*** Transferência de Proprietário ***\n");
		
		terrivel.setNomeProprietario("Bárbrinha");
		terrivel.imprimirInfo();
	
		POO1Automovel valente = new POO1Automovel("Diego Silva", "Audi", "BDS1612", 2021);
		valente.imprimirInfo();
		
		valente.setPlaca("BDS2G12");
		valente.imprimirInfo();
	}
}
