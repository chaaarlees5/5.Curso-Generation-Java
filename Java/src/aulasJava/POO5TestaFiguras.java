package aulasJava;

public class POO5TestaFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POO5Quadrado fig1 = new POO5Quadrado(10, "Quadrado1");
		POO5Retangulo fig2 = new POO5Retangulo(3, 4, "Retangulo1");
		
		System.out.println(fig1.getNome() + ": " + fig1.getDiagonal());
		System.out.println(fig2.getNome() + ": " + fig2.getDiagonal());
	}
}
