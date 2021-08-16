package aulasJava;

public class POO6Celular1 extends POO6Telefone1 {
	
	public POO6Celular1() {
		super("Telefone celular");
	}
	
	@Override // Sobrescreve o m�todo toca da minha SuperClasse
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("Tandandantantan...Tandandantantan");
			break;
		case 2:
			System.out.println("Tururututututu...Tururututututu");
			break;
		default:
			System.out.println("T�t�dandant�t�...T�t�dandant�t�");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nO n�mero " + numero + " � o celular.");
	}

}
