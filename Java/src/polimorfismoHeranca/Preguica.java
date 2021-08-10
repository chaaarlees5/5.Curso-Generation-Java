package polimorfismoHeranca;

public class Preguica extends Animal {
	
	private String sobe;
	
	public Preguica(String nome, int idade, String som, String subir) {
		super(nome, idade, som);
		this.sobe = subir;
	}

	public String getSobe() {
		return sobe;
	}

	public void setSobe(String sobe) {
		this.sobe = sobe;
	}
	
}
