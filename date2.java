import java.util.Date;

public class date2 extends date1{

	protected Date dataValidade;
	
	public void identificar() {
		super.identificar();
		System.out.println("Minha data de validade é: " + dataValidade);
	}
}
