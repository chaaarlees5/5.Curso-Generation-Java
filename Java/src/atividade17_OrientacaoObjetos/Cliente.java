package atividade17_OrientacaoObjetos;
/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações 
 * deste objeto no console.
 */
public class Cliente {
	
	private String animal;
	private String nome;
	private float peso;
	private int idade;
	private int horas;
	private int minutos;

	public Cliente(String anim, String nom, float pes, int idad, int hora, int minuto) {
		this.setAnimal(anim);
		this.setHoras(hora);
		this.setNome(nome);
		this.setPeso(peso);
		this.setIdade(idade);
		this.setMinutos(minuto);
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
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
	
	public void imprimirInfo(int y) {
			System.out.printf("\n************** %d° **************", y);
			System.out.println("\nAnimal: " + animal);
			System.out.println("Nome: " + nome);
			System.out.println("Peso: " + peso + "kg(s)");
			System.out.printf("Idade: %d anos\n", idade);
	}
}
