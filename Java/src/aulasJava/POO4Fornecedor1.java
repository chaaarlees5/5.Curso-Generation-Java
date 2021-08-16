package aulasJava;

public class POO4Fornecedor1 extends POOPessoa {

		private double valorCredito;
		private double valorDivida;
		
		public POO4Fornecedor1(String nome, String endereco, String cpf, int telefone, int idade, double valorCredito, double valorDivida) {
			super(nome, endereco, cpf, telefone, idade);
			this.valorCredito = valorCredito;
			this.valorDivida = valorDivida;
		}
		
		public void imprimirInfo() {
			System.out.println("\nNome do fornecedor: " + getNome() + "\nCPF: " + getCpf() + "Idade: " + getIdade() + 
					"\nTelefone: " + getTelefone() + "\nEndereco: " + getEndereco() +
					"\nValor cr�dito: " + valorCredito +
					"\nValor da d�vida: " + valorDivida);
		}
		
		public void ValidarCpf() {
			if (getCpf().length() != 11) {
				System.out.println("\n--CPF inv�lido!!!");
			} else {
				System.out.println("\n--CPF v�lido!!!");
			}
		}
		
		public void obterSaldo() {
			double diferencaCredito = valorCredito - valorDivida;
			System.out.println("\nO saldo referente ao fornecedor � igual a " + diferencaCredito);
		}

		public double getValorCredito() {
			return valorCredito;
		}

		public void setValorCredito(double valorCredito) {
			this.valorCredito = valorCredito;
		}

		public double getValorDivida() {
			return valorDivida;
		}

		public void setValorDivida(double valorDivida) {
			this.valorDivida = valorDivida;
		}
}
