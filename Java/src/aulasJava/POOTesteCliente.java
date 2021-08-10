package aulasJava;

public class POOTesteCliente {

	public static void main(String[] args) {
		POOCliente cliente1 = new POOCliente("Cris", 1234);
		
		cliente1.compra();
		System.out.println("\n" + cliente1.getInfo());
	}

}
