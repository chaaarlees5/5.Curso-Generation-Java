package aulasJava;

public class POO2TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POO2Empregado[] lista = new POO2Empregado[3];
		
		lista[0] = new POO2Empregado("Diego Silva", 10000);
		lista[1] = new POO2Empregado("Juliana", 9000);
		lista[2] = new POO2Empregado("Mayara Luzia", 20000);
		
		for(POO2Empregado roda:lista) {
			roda.imprimir();
		}
		System.out.println("*****************************************************************");
		
		for(POO2Empregado roda:lista) {
			roda.aumentarSalario(10);
			roda.imprimir();
		}
	}

}
