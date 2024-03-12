import java.util.Scanner;

/**
 * 
 * esta classe e util pra fazer calculo imc o imc e baseado no peso e altura da pessoa
 * @author kaiod
 * @param
 */









public class Imc {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("digite seu peso");
		Double peso = ler.nextDouble();
		
		
		System.out.println();
		System.out.println("digite sua altura");
		Double altura = ler.nextDouble();
		
		System.out.println();
		Double imc = peso/altura;
		
		System.out.println("seu imc e :" + imc);
	}

}
