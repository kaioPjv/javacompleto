import java.util.Scanner;

public class calculadoraaddesubb {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("digite soma 1");
        double numero1 = scanner.nextDouble();
        
        
        System.out.println("Digite a Soma: 1 - a Soma, 2 - Subtração");
        Integer opicao = scanner.nextInt();

        System.out.println("digite soma 2");
        double numero2 = scanner.nextDouble();
        
     int opiao;
     if (opicao == 1) {
    	 System.out.println("a adiçao dos numeros e = " + (numero1 - numero2));
        
       if (opicao == 2) {
    	   System.out.println("a subtraçao dos numeros e = " + (numero1 - numero2));
       }
        	
     }
     
	}
	
}
