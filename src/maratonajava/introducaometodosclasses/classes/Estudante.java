package maratonajava.introducaometodosclasses.classes;

import java.util.Scanner;

public class Estudante {
	
	String nome;
	int idade;
	int [] notas = new int[3];
	int somaMedia;
	Scanner scan = new Scanner(System.in);
	
	public void imprimeDados(){
	
		System.out.println("Digite seu nome: \n");
		nome = scan.nextLine();
		System.out.println("Digite sua idade: \n");
		idade = scan.nextInt();
		mediaNota();
		
		
	}
	
	public void mediaNota(){
		System.out.println("Digite suas notas: \n");
		for(int i=0; i < 3; i++){
			notas[i] = scan.nextInt();
			somaMedia += notas[i];
			
			if(notas[i] <= 0){
				System.out.println("Erro, digite a nota corretamente");
				return;
				
			}
		}
		somaMedia = somaMedia / notas.length;
			
		if(somaMedia > 60){
			System.out.println("Aprovado: " +somaMedia);
		}
		else{
			System.out.println("Reprovado: " +somaMedia);
		}
	}
	
}
