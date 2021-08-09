package atividade17_OrientacaoObjetos;

import java.text.NumberFormat;
import java.util.Scanner;

public class Patinete {

	 private String cor;
	 public int marca;
	 private boolean motor;
	 public float valor;
	//private boolean infantil;
	
	public Patinete(String x, int marc, boolean mot, float val) {
		this.cor = x;
		this.marca = marc;
		this.motor = mot;
		this.valor = val;
//		this.setInfantil(infant);
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cores) {
		this.cor = cores;
	}

	public int getMarca() {
		return marca;
	}

	public void setMarca(int marcas) {
		this.marca = marcas;
	}

	public boolean getMotor() {
		return motor;
	}

	public void setMotor(boolean leia) {
		this.motor = leia;
	}

	public float getValor() {
		if(marca == 1) {
			this.valor += 250;
		} else {
			this.valor += 450;
		}
		if(motor == true) {
			this.valor += 670;
		} else {
			this.valor += 122;
		}
		return valor;
	}

	public void setValor(float value) {
		this.valor = value;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //Define a formatação da moeda conforme a linguagem do computador
		nf.setMinimumFractionDigits(2); //Quantidade de casas depois da vírgula
		String formatoMoeda = nf.format(this.getValor());
		return formatoMoeda;
	}

	public void imprimirInfo() {
		System.out.println("\nInformações do Patinete: ");
		System.out.println("Cor: " + cor);
		System.out.println("Marca: " + marca);
		System.out.println("Motorizado: " + motor);

		System.out.printf("\nO patinete custa %s", this.formatarMoeda());
	}
}
