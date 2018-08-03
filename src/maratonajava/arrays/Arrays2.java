package maratonajava.arrays;

public class Arrays2 {

	public static void main(String[] args) {

		String[] nomes = new String [3];
		int[] idade = new int[3];
		String[] endereco = new String [3];
		
		nomes[0] = "Diego";
		nomes[1] = "Jessika";
		nomes[2] = "Evaldt";
		
		endereco [0] = "Rua jose huberto Bronca";
		endereco [1] = "Rua jose huberto Bronca n60";
		
		idade[0] = 30;
		idade[1] = 26;
		idade[2] = 50;
		
		
		for(int i=0; i<nomes.length; i++){
			System.out.println("Nome: " + nomes[i] + " \n Idade: " +idade[i]);
		}
	}
	

}
