package polimorfismoHeranca;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro("Tina", 16, "Auauauauauauauauauauauau", "CorreCorre");
		Cavalo cavalo = new Cavalo("Kinder", 18, "RelinchaRelincha", "CorreCorreu");
		Preguica preguica = new Preguica("Neguinho", 8, "ZZZZZZZZzzzzzzzzZZZZZzZZZZZz", "EscalaEscala");
		
		cachorro.imprimir();
		System.out.println("\n**********************\n");
		cavalo.imprimir();
		System.out.println("\n**********************\n");
		preguica.imprimir();
	} 

}
