import java.util.Scanner;

public class treinere {
	
	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		
		System.out.println("conta agua");
		Double contaagua = ler.nextDouble();
		
		
		System.out.println("conta cartao");
		Double contacartao = ler.nextDouble();
		
		System.out.println("conta luz ");
		Double contaluz = ler.nextDouble();
		
		
		double total = contaagua
				+=contacartao
				+=contaluz;
		
		
		
		System.out.println("resultado mensal ="  + total);
	}
}
