package aulasJava;

public class POOQuadrado extends POOBaseFigura //Extende a classe POOBaseFigura e implementa a interface POOFiguras
						 implements POOFiguras //Multipla herança //Posso colocar mais implementos separados por virgula 
						 { 
	POOQuadrado (double lado, String nome) 
	{
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
