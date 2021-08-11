package polimorfismoHeranca;

public class Cachorro extends Animal {
	
	protected String corre;
	
	public Cachorro(String nome, int idade, String som, String corrida) {
		super(nome, idade, som);
		this.corre = corrida;
	}

	public String getCorre() {
		return "\nSerá que o doguinho corre?\n" + this.corre;

	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	
	public void imprimir() {
		 System.out.println("Nome do Cachorro: " + getNome() +
		"\nIdade: " + getIdade() +
		"\nOlha o barulhinho do dog: " + getSom() +
		getCorre());
	}
	
}
