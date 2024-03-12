import java.math.BigDecimal;
import java.text.DecimalFormat;

import java.text.NumberFormat;
import java.text.ParseException;

public class valorProduto {
	
	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		double valorProduto = 13.5;
		
		System.out.println(valorProduto);
		System.out.println(formatador.format(valorProduto));
	
		try {
		
		String entrada  = "R$ 50,36";
		Double numero = formatador.parse(entrada).doubleValue();
		
			System.out.println("numero:" + numero);
		} catch (ParseException e) {
			// TODO: handle exception
			System.out.println("entrada invalida");
			
			BigDecimal bg = new BigDecimal(5131231231000d);
			bg = bg.divide(BigDecimal.TEN);
		}
		
		
	}
	
}