package aulasJava;

public class POOOperario1 extends POOPessoa {
	
	private double valorProducao;
	private double comissao;
	
	public POOOperario1(String nome, String endereco, String cpf, int telefone, int idade, double valorProducao, double comissao) {
		super(nome, endereco, cpf, telefone, idade);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do operário: " + getNome() + "\nCPF: " + getCpf() + "Idade: " + getIdade() + 
				"\nTelefone: " + getTelefone() + "\nEndereco: " + getEndereco() +
				"\nValor monetário total dos artigos produzidos por " + getNome() + ": " + valorProducao +
				"\nPorcentagem (sem o %) da comissão deste artigo: " + comissao);
	}
	
	public void calcularValorArtigo() {
		double valor_total = valorProducao + (valorProducao * (comissao/100));
		System.out.println("\nO valor total a ser recebido pelo operário " + getNome() + " é igual a: " + valor_total);
	}
}
