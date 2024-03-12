
public class Carro {  //adiciona atrabutos embaixo
	
		
	String fabricante;
	String modelo;
	 String cor;
	int anoDeFabricacao;
	boolean biCombustivel;
	
	proprietario dono;
	
	void alterarModelo(String modelo) {
		if (modelo !=null);
		this.modelo = modelo;

		}
	void ligar() {
	   if (modelo != null) {
		   System.out.println("ligando o carro: " + modelo);
	  
	   }
	
	}
	
}

