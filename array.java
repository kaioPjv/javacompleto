
public class array {
	
	public static void main(String[] args) {
		int[] estoque = new int[4];
	estoque[0] = 10;
	estoque[1] = 5;
	estoque[2] = 8;
	estoque[3] = 9;
		
		System.out.println("produto: " + 	estoque[0]);
		
		System.out.println("quantidade : " + 	estoque.length);
		for (int i = 0; i < 	estoque.length; i++) {
			System.out.println("Posiçao[" + i + "]=" + 	estoque[i]);
		}
		
	}

}
 

