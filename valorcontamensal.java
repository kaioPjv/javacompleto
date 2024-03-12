import java.util.Scanner;

public class valorcontamensal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	
	System.out.println("conta luz");
	double luz = sc.nextDouble();
	
	System.out.println("conta agua");
	double agua = sc.nextDouble();
	
	System.out.println("conta cartao");
	double cartao = sc.nextDouble();
	
	double total = luz
	+=agua
	+=cartao;
    
    
    		System.out.print("resultado mensal =" + total);
    
	}

	}