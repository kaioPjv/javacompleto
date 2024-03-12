import java.util.Scanner;

public class devolta {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite um numero 1 ");
		int divisor = ler.nextInt();
		
		for ( int i = 100; i <= 120; i++) {
			
			if (i % divisor == 0) {
				continue;
				
				
			}
			System.out.println(i);
			
	
		}
		System.out.println("fim programa");
	}
	

}
