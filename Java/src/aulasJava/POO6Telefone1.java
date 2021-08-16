package aulasJava;

public abstract class POO6Telefone1 { //'abstract' para tornar a classe Abstrata

	private String tipo;
	
	abstract public void disca(String numero); //Criação do método abstrato.
	abstract public void toca(int numToques); //Criação do método abstrato.
	
	public POO6Telefone1(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
