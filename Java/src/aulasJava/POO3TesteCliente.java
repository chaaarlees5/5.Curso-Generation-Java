package aulasJava;

public class POO3TesteCliente {

	public static void main(String[] args) {
		POO3Cliente cliente1 = new POO3Cliente("Cris", 1234);
		
		cliente1.compra();
		System.out.println("\n" + cliente1.getInfo());
	}

}
