package maratonajava.introducaometodosclasses.test;

import maratonajava.introducaometodosclasses.classes.Professor;

public class ProfessorTest {

	public static void main(String[] args) {
		
		Professor prof = new Professor();
		Professor prof2 = new Professor();
		
		prof.nome = "Diego";
		prof.cpf = "015-989-060-89";
		prof.matricula = "ABV13243";
		prof.rg = "1093189775";
		
		prof2.nome = "Jessika";
		prof2.cpf = "233449389";
		prof2.matricula = "KNNJS234";
		prof2.rg = "3243584";
		
		prof.imprime();
		
		
		
	}

}
