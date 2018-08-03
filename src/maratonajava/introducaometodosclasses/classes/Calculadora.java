package maratonajava.introducaometodosclasses.classes;

public class Calculadora {
	
	
	public void somaDoisNumeros(){
		System.out.println(5+5);
	}
	
	public void subtraiDoisNumeros(){
		System.out.println(5-5);
	}
	
	public void multiplicaDoisNumeros(int numero1, int numero2){
		int soma = numero1*numero2;
		System.out.print(soma);
		
	}
	public double divideDoisNumeros(double num1, double num2){
		System.out.println( num1 / num2);
		return num1 / num2;
	}
	public void imprimeDoisNumeros(double num1, double num2){
		if(num2 != 0){
			System.out.println(num1/num2);
			return;
		}
		
		System.out.println("Não é possivel imprimir por 0.");
	}
	public void alteraDoisNumeros(int num1, int num2){
		num1 = 30;
		num2 = 40;
		System.out.println("Dentro do altera dois numeros");
		System.out.println("num1:" +num1);
		System.out.println("num2:" +num2);
	}
	
	public void somaArray(int[] numeros){
		int soma = 0;
		for(int num : numeros){
			soma += num;
		}
		System.out.println(soma);
	}
	
	public void somaVarArgs(double num1, String nome, int... numeros){
		int soma = 0;
		for(int num : numeros){
			soma += num;
		}
		System.out.println(soma + "\n" + nome + "\n" +num1);
	}
	
	
}
