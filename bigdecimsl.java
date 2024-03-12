import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class bigdecimsl {

	
	public static void main(String[] args) {
		
		 String ValorMonetario = null;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		double valorDouble = ler.nextDouble();
		
		BigDecimal valorBigDecimal = new BigDecimal(valorDouble);
		valorBigDecimal = valorBigDecimal.multiply(new BigDecimal(0.10));
		
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		String valorMonetario = formatador.format(valorBigDecimal);
		
		System.out.println("10 % do valor digitado: " + valorMonetario);
     
	      
	}
	
}
