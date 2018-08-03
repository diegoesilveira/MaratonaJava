package maratonajava.sobrecargaconstrutores.classes;

import java.util.Scanner;

public class Estudante {
	
	private String matricula;
	private String nome;
	private double[] notas = new double[4];
	
	
	public Estudante(String matricula, String nome, double[] notas){
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}
	public Estudante(){
		
	}
	
	public void pegaDados(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome: \n");
		this.nome = scan.nextLine();
		System.out.println("Digite sua matricula: \n");
		this.matricula = scan.nextLine();
		System.out.println("Digite suas notas: \nPara sair digite ");
		
		for(int i = 0; i < notas.length; i++){
			
			notas[i] =scan.nextDouble();
		}
		
		
	}
	public void imprime(){
		pegaDados();
		System.out.println("\nNome: " +nome);
		System.out.println("\nMatricula: " +matricula);
		
		for(int i = 0; i < notas.length; i++){
			System.out.println("\nNotas: " +notas[i]);
		}
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	

}
