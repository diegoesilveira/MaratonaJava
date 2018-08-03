package maratonajava.blocodeinicializacao.test;

import maratonajava.blocodeinicializacao.classes.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		System.out.println("\nExibindo quantidade de parcelas disponiveis.");
		for(int parcela : c.getParcelas()){
			System.out.println(parcela);
			
		}
		
	}

}
