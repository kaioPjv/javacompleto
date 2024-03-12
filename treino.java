import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class treino {
	
	public static void main(String[] args) {
		
		String valorMonetario = null;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informe valor");
		Double valorDouble = ler.nextDouble();
		
		BigDecimal valorBigDecimal = new BigDecimal(valorDouble);
	    valorBigDecimal = valorBigDecimal.multiply(new BigDecimal(0.19));
	
	    DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
	    String ValorMonetario = formatador.format(valorBigDecimal);
	    
	    System.out.println("valor digitado " + valorMonetario);
	}

}
