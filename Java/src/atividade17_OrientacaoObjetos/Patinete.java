package atividade17_OrientacaoObjetos;

import java.util.Scanner;

public class Patinete {

	public String cor;
	private String marca;
	private String motor;
	private float valor;
	//private int qtdRodas;
	//private int garantia;
	//private boolean motor;
	//private boolean infantil;
	
	public Patinete(String cor, String marc, boolean mot, float val) {
		this.setCor(cor);
		this.setMarca(marc);
		this.setMotor(mot);
		this.setValor(val);
//		this.setInfantil(infant);
//		this.setQtdRodas(rodas);
//		this.setGarantia(garant);
	}

	//public void imprimirInfo(String cor, String marca, float valor) {
	public void imprimirInfo() {
		System.out.println(cor);
		System.out.println(marca);
		System.out.println(motor);
		//System.out.printf("\nO patinete %s da marca %s custa R$%f", cor, marca, valor);
	}
	
	public void receberCor(String x) {
		this.cor = x;
	}

	public void receberMarca(String x) {
		this.marca = x;
	}
	
	public void receberMotor(String x) {
		this.motor = x;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
/*
	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
*/
	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
/*
	public boolean isInfantil() {
		return infantil;
	}

	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}
*/
}
