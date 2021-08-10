package polimorfismoHeranca;

public class Cachorro extends Animal {
	
	private String corre;
	
	public Cachorro(String nome, int idade, String som, String corrida) {
		super(nome, idade, som);
		this.corre = corrida;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	
}
