package aulasJava;

public class POOAutomovel {
	
	//declaração dos atributos da classe
	
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	//Criação do método Construtor
	
	public POOAutomovel(String nomeProprietario, String modelo, String placa, int ano) {
		this.nomeProprietario = nomeProprietario; //inicializa atributos da classe POOAutomovel
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}
	
	public POOAutomovel(String modelo) {
		this.modelo = modelo;
	}
	
	public void imprimirInfo() {
		System.out.println("\n" + nomeProprietario + " possui um(a) " + modelo + " com placa: " + placa + " e ano " + ano);
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
