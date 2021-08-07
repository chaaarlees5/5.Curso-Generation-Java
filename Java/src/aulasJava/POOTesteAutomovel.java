package aulasJava;

public class POOTesteAutomovel {
	
	public static void main(String[] args) {
		// Instanciando um Objeto da Classe POOAutomovel
		
		POOAutomovel terrivel = new POOAutomovel("Alysson Rodrigo", "Porsche", "GNB-1404", 2021);
		// Troca de mensagens
		terrivel.imprimirInfo();
		
		System.out.println("\n\n*** Transferência de Proprietário ***\n");
		
		terrivel.setNomeProprietario("Bárbrinha");
		terrivel.imprimirInfo();
	
		POOAutomovel valente = new POOAutomovel("Diego Silva", "Audi", "BDS1612", 2021);
		valente.imprimirInfo();
		
		valente.setPlaca("BDS2G12");
		valente.imprimirInfo();
	}
}
