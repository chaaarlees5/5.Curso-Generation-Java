package aulasJava;

public class POO6Fixo1 extends POO6Telefone1 {
	
	public POO6Fixo1() {
		super("Telefone fixo");
	}
	@Override
	public void toca(int numToques) {
		for(int i=0; i < numToques; i++) {
			System.out.println("Dlindon...Dlindon");
		}
	}
	@Override
	public void disca(String numero) {
		System.out.println("\nDiscando: " + numero);
	}
}
