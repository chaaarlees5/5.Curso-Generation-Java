package aulasJava;

public class POOTestaFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POOQuadrado fig1 = new POOQuadrado(10, "Quadrado1");
		POORetangulo fig2 = new POORetangulo(3, 4, "Retangulo1");
		
		System.out.println(fig1.getNome() + ": " + fig1.getDiagonal());
		System.out.println(fig2.getNome() + ": " + fig2.getDiagonal());
	}

}
