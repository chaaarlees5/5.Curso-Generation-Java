package aulasJava;

import java.util.Scanner;

public class POO3Cliente {
	Scanner leia = new Scanner(System.in);
	
	double vp, vt; // vp = valor do produto e vt = valor total
	
	private String nomeCliente;
	private int codigoCliente;
	
	public POO3Cliente(String nome, int codigo) {
		this.nomeCliente = nome;
		this.codigoCliente = codigo;
	}
	
	public Scanner getLeia() {
		return leia;
	}
	
	public void setLer(Scanner leitura) {
		this.leia = leitura;
	}
	
	public double getVp() {
		return vp;
	}
	
	public void setVp(double valorProduto) {
		this.vp = valorProduto;
	}
	
	public double getVt() {
		return vt;
	}
	
	public void setVt(double valorTotal) {
		this.vp = valorTotal;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public double valor(double valorTotal) {
		System.out.println("O valor total de cada produto deve ser inserido individualmente..."
				+ "\nPara finalizar entre com um número menor ou igual a 0.");
		do {
			System.out.print("\nEntre com um valor: ");
			vp = leia.nextDouble();
			valorTotal += vp;
		} while(vp > 0.0);
		
		return valorTotal;
	}
	
	public String getInfo() {
		String info = nomeCliente + "\t\t\t" + codigoCliente;
		return info;
	}
	
	public void compra() {
		System.out.printf("\nTotal: %.2f", valor(0.0));
	}
}
