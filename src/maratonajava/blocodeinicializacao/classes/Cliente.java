package maratonajava.blocodeinicializacao.classes;
	
//1 - Alocado espaco na memoria para o objeto criado
//2 - Cada atributo de classe e criado e inicializado com valor default ou valores explicitos
//3 - Bloco de inicializacao é executado primeiro
//4 - O construtor é executado

public class Cliente {
	private int[] parcelas = {1,2,3,4,5,6,7,8,9,10};

	{
		System.out.println("Dentro do bloco de inicializacao");
		for(int i=1; i < 100; i++){
			parcelas[i-1] =i;
		}
	}
	public Cliente(){
	}
	
	public int[] getParcelas() {
		return parcelas;
	}

	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}

}
