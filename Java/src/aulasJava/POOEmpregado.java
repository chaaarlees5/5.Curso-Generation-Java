package aulasJava;

import java.text.NumberFormat;

public class POOEmpregado {
	
	private String nome;
	private double salario;

	public POOEmpregado(String n, double s) {
		this.metodo1(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void metodo1(String x) {
		this.nome = x;
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
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //Define a formatação da moeda conforme a linguagem do computador
		nf.setMinimumFractionDigits(2); //Quantidade de casas depois da vírgula
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println(nome + "\t\t" + "Salário: " + this.formatarMoeda());
	}
}
