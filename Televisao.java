
public class Televisao {
	
	Integer volume = 40;

	Integer canal1 = 25;
	
	void mudançacanal (Integer voltandoCanal) {
		if (canal1 == voltandoCanal) {
			System.out.println(" o novo canal e um canal muito bom: ");
			
		}	else {
				
				canal1 = voltandoCanal;
			System.out.println("a volts do canal :" + canal1);
			
			
			
		}
	}
	
	void mudarVolume(Integer novoVolume) {
		if (volume == volume  ) {
			System.out.println("o volume esta muito melhor assim");
			
		} else {
			
			volume = volume;
			System.out.println(" abaixar volume:"  + volume);
		}
	}

	
		
	
	public static void main(String[] args) {
		Televisao tv = new Televisao();

	tv.mudarVolume(20);
	tv.mudançacanal(154);
	
	
	// deveria mudar
	tv.mudarVolume(100);
	tv.mudançacanal(10);
	
	}

}
