public class ProdutoPerecivel extends produtos {

	String dataValidade; //Por enquanto, até aprendermos a classe Date
	
	public void imprimirDescricao() {
		//Digitar a lógica...
		System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
	}

	public void identificar() {
		// TODO Auto-generated method stub
		
	}
	
}