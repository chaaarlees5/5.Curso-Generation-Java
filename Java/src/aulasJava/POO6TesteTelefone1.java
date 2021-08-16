package aulasJava;

public class POO6TesteTelefone1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POO6Celular1 celular = new POO6Celular1();
		POO6Fixo1 fixo = new POO6Fixo1();
		POO6TelPublico1 publico = new POO6TelPublico1();
		POO6Telefone1 telefone = null;
		
		int n = (int) (Math.random()*3.0); //segundo int usado para pegar só a parte inteira de Random
		
		System.out.println("O número escolhido foi: " + n);
		
		switch(n) {
		case 0:
			telefone = celular;
			break;
		case 1:
			telefone = fixo;
			break;
		case 2:
			telefone = publico;
			break;
		default:
			System.out.println("\nErro inesperado...");
		}
		
		if(telefone != null) {
			telefone.disca("92324544");
			telefone.toca(n);
		}
	}

}
