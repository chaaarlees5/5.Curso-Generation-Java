package aulasJava;

public class POO4Empregado1 extends POOPessoa {
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public POO4Empregado1(String nome, String endereco, String cpf, int telefone, int idade, int codigoSetor, float salarioBase, float imposto) {
		super(nome, endereco, cpf, telefone, idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do empregado: " + getNome() + "\nCPF: " + getCpf() + "Idade: " + getIdade() + 
				"\nTelefone: " + getTelefone() + "\nEndereco: " + getEndereco() + "\nCódigo do setor: " + codigoSetor +
				"\nSalário base: " + salarioBase + "\nValor em porcentagem (sem o %) de imposto retido do salario: " + imposto);
	}
	
	public void calcularSalario() {
		double salario_total = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nO salário total a ser recebido pelo empregado " + getNome() + " é igual a " + salario_total);
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

}
