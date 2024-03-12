import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class nog {
	
	public static void main(String[] args) {
		
		String ValorMonetario = null;
		
		Scanner ler = new Scanner(System.in);
		double valorDouble = ler.nextDouble();
		
		
		BigDecimal valorBigdecimal = new BigDecimal(valorDouble);
		valorBigdecimal = valorBigdecimal.multiply(new BigDecimal(0.10));
	
	   DecimalFormat formatador = new DecimalFormat("R$ #,#0.00");
	   String valorMonetario = formatador.format(valorBigdecimal);
	   
	   
	   System.out.println("10 % do valor digitando: " + valorMonetario);
	
	
	}
	
}
	
	