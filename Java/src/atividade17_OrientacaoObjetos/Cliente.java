package atividade17_OrientacaoObjetos;
/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações 
 * deste objeto no console.
 */
public class Cliente {
	
	private String animal;
	private String raca;
	private String nome;
	private float peso;
	private int idade;

	public Cliente(String an, String raca, String nome, float peso, int idade) {
		this.setAnimal(an);
		this.setRaca(raca);
		this.setNome(nome);
		this.setPeso(peso);
		this.setIdade(idade);
	}

	public void imprimirInfo() {
		System.out.println("O " + animal + " da raça " + raca + ", de nome  " + nome + ", pesa " + peso + "kg");
	}
	
	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
