package maratonajava.sobrecargametodos.test;

import java.util.Scanner;

import maratonajava.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome;
		String cpf;
		String rg;
		double salario;
		
		Funcionario func = new Funcionario();
		
		System.out.println("Digite seu nome: ");
		nome = scan.nextLine();
		System.out.println("Digite seu CPF: ");
		cpf = scan.nextLine();
		System.out.println("Digite seu salario: ");
		salario = scan.nextDouble();
		scan.nextLine();
		System.out.println("Digite seu RG: ");
		rg = scan.nextLine();
		func.init(nome, cpf, salario, rg);
		func.imprimeDados();
		
	}

}
