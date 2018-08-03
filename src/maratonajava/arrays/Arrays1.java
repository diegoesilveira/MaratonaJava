package maratonajava.arrays;

public class Arrays1 {

	public static void main(String[] args) {

		String [] nome = new String[3];
		int [] idades = new int[3];
		
		nome[0] = "Diego";
		nome[1] = "Victor";
		nome[2] = "Joao";
		
		idades[0] = 30;
		idades[1] = 5;
		idades[2] = 3;
		
		for(int i= 0; i<3;i++){
			
			System.out.println("O nome é "+nome[i]+ " idade é " +idades[i] );
			
		}
		
		
		
	}

}
