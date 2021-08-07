package aulasJava;

public class POOTesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POOEmpregado[] lista = new POOEmpregado[3];
		
		lista[0] = new POOEmpregado("Diego Silva", 10000);
		lista[1] = new POOEmpregado("Juliana", 9000);
		lista[2] = new POOEmpregado("Mayara Luzia", 20000);
		
		for(POOEmpregado roda:lista) {
			roda.imprimir();
		}
		System.out.println("*****************************************************************");
		
		for(POOEmpregado roda:lista) {
			roda.aumentarSalario(10);
			roda.imprimir();
		}
	}

}
