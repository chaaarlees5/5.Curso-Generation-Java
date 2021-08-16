package aulasJava;

public class POO5Quadrado extends POO5BaseFigura //Extende a classe POOBaseFigura e implementa a interface POOFiguras
						 implements POO5Figuras //Multipla herança //Posso colocar mais implementos separados por virgula 
{ 
	POO5Quadrado (double lado, String nome) {
		
		super(lado, lado, nome);
		
		nomeClasse = "Quadrado";
		//Argumentos para a SuperClasse
	}
	@Override
	public double getDiagonal() 
	{ //Tem na Interface
		return Math.sqrt(2) * lado1;
	}
}
