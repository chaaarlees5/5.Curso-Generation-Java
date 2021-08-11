package polimorfismoHeranca;

public class Preguica extends Animal {
	
	private String sobe;
	
	public Preguica(String nome, int idade, String som, String subir) {
		super(nome, idade, som);
		this.sobe = subir;
	}

	public String getSobe() {
		return "\nO seu Preguiça ta subindo todas as árvores!";
	}

	public void setSobe(String sobe) {
		this.sobe = sobe;
	}
	
	public void imprimir() {
		 System.out.println("Nome da Preguiça: " + getNome() +
		"\nIdade: " + getIdade() +
		"\nQual o barulho da preguiça?\n" + getSom() +
		getSobe());
	}
}
