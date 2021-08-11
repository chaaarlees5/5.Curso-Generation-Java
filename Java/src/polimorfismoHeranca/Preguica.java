package polimorfismoHeranca;

public class Preguica extends Animal {
	
	private String sobe;
	
	public Preguica(String nome, int idade, String som, String subir) {
		super(nome, idade, som);
		this.sobe = subir;
	}

	public String getSobe() {
		return "\nO seu Pregui�a ta subindo todas as �rvores!";
	}

	public void setSobe(String sobe) {
		this.sobe = sobe;
	}
	
	public void imprimir() {
		 System.out.println("Nome da Pregui�a: " + getNome() +
		"\nIdade: " + getIdade() +
		"\nQual o barulho da pregui�a?\n" + getSom() +
		getSobe());
	}
}
