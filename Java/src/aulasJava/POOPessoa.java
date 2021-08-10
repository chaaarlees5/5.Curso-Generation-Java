package aulasJava;

public class POOPessoa {
	
	protected String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	
	public POOPessoa(String name, String adress, String cpf, int phone, int age) {
		super(); //Indicar que é uma SuperClasse
		this.nome = name;
		this.endereco = adress;
		this.cpf = cpf;
		this.telefone = phone;
		this.idade = age;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void ValidarCpf() {
		if (getCpf().length() != 11) {
			System.out.println("\n--CPF inválido!!!");
		} else {
			System.out.println("\n--CPF válido!!!");
		}
	}
}
