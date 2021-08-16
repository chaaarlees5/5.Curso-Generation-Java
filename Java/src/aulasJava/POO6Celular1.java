package aulasJava;

public class POO6Celular1 extends POO6Telefone1 {
	
	public POO6Celular1() {
		super("Telefone celular");
	}
	
	@Override // Sobrescreve o método toca da minha SuperClasse
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("Tandandantantan...Tandandantantan");
			break;
		case 2:
			System.out.println("Tururututututu...Tururututututu");
			break;
		default:
			System.out.println("Tãtãdandantãtã...Tãtãdandantãtã");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nO número " + numero + " é o celular.");
	}

}
