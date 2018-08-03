package maratonajava.sobrecargametodos.classes;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario; 
	private String rg;
	
	
	public Funcionario(String nome, String cpf, double salario){
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		
		
	}
	public Funcionario(){
		
	}
	
	public void imprimeDados(){
		
		System.out.println("\n\nNome: " +this.nome+ "\nCPF: " +this.cpf+
				"\nSalario: " +salario+ "\nRG: " +this.rg);
	}
	
	public void init(String nome, String cpf, double salario){
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		
		
	}
	public void init(String nome, String cpf, double salario, String rg){
		init(nome,cpf,salario);
		this.rg = rg;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public String getCpf(){
		return this.cpf;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public double getSalario(){
		return this.salario;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
