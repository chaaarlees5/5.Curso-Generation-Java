package polimorfismoHeranca;

public class Cavalo extends Animal {
	
	private String corre;
	
	public Cavalo(String nome, int idade, String som, String corrida) {
		super(nome, idade, som);
		this.corre = corrida;
	}

	public String getCorre() {
		return "\nTa correndo o cavalinho: Pocot�Pocot�Pocot�!";
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	
	public void imprimir() {
		 System.out.println("Nome do Cavalo: " + getNome() +
		"\nIdade: " + getIdade() +
		"\nE l� vem o pangar� com seu som: " + getSom() +
		getCorre());
	}
}
