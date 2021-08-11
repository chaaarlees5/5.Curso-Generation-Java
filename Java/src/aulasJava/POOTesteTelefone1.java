package aulasJava;

public class POOTesteTelefone1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POOCelular1 celular = new POOCelular1();
		POOFixo1 fixo = new POOFixo1();
		POOTelPublico1 publico = new POOTelPublico1();
		POOTelefone1 telefone = null;
		
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
			telefone.toca(1);
		}
	}

}
