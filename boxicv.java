import java.util.Scanner;

public class boxicv {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		// o boxing faz a conversão automatica do codigo
		
		Integer i1 = 126;
		Integer i2 = 126;
		
		Integer i3 = 272;
		Integer i4 = 272;
		
		
		System.out.println(i1 == i2);
		System.out.println(i3 == i4);
		
	}

}
