import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class foe {
	
	public static void main(String[] args) {
		
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(hoje));
		
		
		String dataAniversario = "15/1/2010";
		DateFormat formatador2  = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date aniversaro = formatador2.parse(dataAniversario);
			System.out.println(formatador.format(aniversaro));
			
		} catch (ParseException e) {
			System.out.println("Formato de data inválido");
		}
	
}
	
}