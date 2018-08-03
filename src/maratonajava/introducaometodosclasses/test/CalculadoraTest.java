package maratonajava.introducaometodosclasses.test;

import maratonajava.introducaometodosclasses.classes.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		calc.somaDoisNumeros();
		calc.subtraiDoisNumeros();
		calc.multiplicaDoisNumeros(5, 5);
		calc.divideDoisNumeros(4.0, 2.0);
		calc.imprimeDoisNumeros(20, 0);
		System.out.println("------------------------------");
		int[] numeros = {1,2,3,4,5};
		calc.somaArray(numeros);
		calc.somaVarArgs(50,"diego",1,2,3,4,5);
		
	}

}
