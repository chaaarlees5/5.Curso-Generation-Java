package aulasJava;

import java.text.NumberFormat;

public class POOEmpregado {
	
	private String nome;
	private double salario;

	public POOEmpregado(String n, double s) {
		this.setNome(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual/100;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //Define a formata��o da moeda conforme a linguagem do computador
		nf.setMinimumFractionDigits(2); //Quantidade de casas depois da v�rgula
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println(nome + "\t\t" + "Sal�rio: " + this.formatarMoeda());
	}
}
