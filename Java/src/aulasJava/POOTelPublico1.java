package aulasJava;

public class POOTelPublico1 extends POOTelefone1 {
	
	public POOTelPublico1() {
		super("Telefone publico");
	}
	
	@Override
	public void toca(int numToques) {
		for(int i=0; i < numToques; i++) {
			System.out.println("Trimtrimtrim...Trimtrimtrim");
		}
	}
	
	@Override
	public void disca(String numero) {
		if(numero.charAt(0) == '9' || numero.charAt(0) == '8') {
			System.out.println("Este telefone não liga para celular.");
		} else {
			System.out.println("Discando: " + numero);
		}
	}
}
